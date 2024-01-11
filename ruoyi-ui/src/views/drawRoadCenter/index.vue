<template>
  <div>
    <amap @do="drawLine" ref="mmap"></amap>

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
  methods: {
    drawLine() {
      let result = {}
      let param = {
        dataflag: 1,
        version: 'v7'
      }
      listNetwork(param).then(res => {
        res.rows.forEach(item => {
          if(!result[item.roadid+'-'+item.cluster]){
            result[item.roadid+'-'+item.cluster]= []
            result[item.roadid+'-'+item.cluster].push([item.gaodeX, item.gaodeY])
          }else {
            result[item.roadid+'-'+item.cluster].push([item.gaodeX, item.gaodeY])
          }
        })

      // listNetwork(param).then(res => {
      //   res.rows.forEach(item => {
      //     if(!result[item.roadid]){
      //       result[item.roadid]= []
      //       result[item.roadid].push([item.gaodeX, item.gaodeY])
      //     }else {
      //       result[item.roadid].push([item.gaodeX, item.gaodeY])
      //     }
      //   })

        Object.entries(result).forEach(item => {
          console.log("f", item)
          if(item[1].length>1){
            let obj = {
              path:item[1],
              id:item[0],
              length: item[1].length
            }
            // this.$refs.mmap.justifyRoute(obj.path)
            this.$refs.mmap.drawPolyLine(obj)
          }

        })
        console.log(this.path)
      })
    }
  },

  mounted() {

  }

}
</script>

<style>

</style>
