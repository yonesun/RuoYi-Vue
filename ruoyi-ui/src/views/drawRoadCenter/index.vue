<template>
  <div>
    <amap :path="path" ref="mmap"></amap>

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
      path: []
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
      Object.values(result).forEach(item => {
        this.path.push(item)
      })
      console.log(this.path)
    })

  }

}
</script>

<style>

</style>
