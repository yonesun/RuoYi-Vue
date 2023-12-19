<template>
  <div>
    <amap :path="path" :data="roadid" ref="mmap"></amap>

  </div>

</template>
<script>
import amap from "@/components/AMap/index.vue";
import {listNetwork} from "@/api/task/network.js"
export default {
  name: "AMap",
  components: {amap},
  data() {
    return {
      path: [],
      roadid: {}
    }
  },

  mounted() {
    let result = {}
    listNetwork().then(res => {
      res.rows.forEach(item => {
        if(!result[item.roadid]){
            result[item.roadid]= []
            result[item.roadid].push([item.gaodeX, item.gaodeY])
        }else {
          result[item.roadid].push([item.gaodeX, item.gaodeY])
        }
      })
      console.log("fs",result)
      // for ([k,v] of result){
      //   this.path = v
      //   this.data= {
      //     id: k
      //   }
      // }
      Object.entries(result).forEach(item => {
        this.path = item[1]
        this.data= {
          id: item[0]
        }

      })

      console.log(this.path)
    })

  }

}
</script>

<style>

</style>
