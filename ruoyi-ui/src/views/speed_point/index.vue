<template>
  <div>
    <amap ref="mmap"></amap>
  </div>

</template>
<script>
import amap from "@/components/AMap/index.vue";
import {listGpshisdata} from "@/api/task/gpshisdata.js"
import data from "@/views/system/dict/data.vue";

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

      listGpshisdata().then(res => {
        console.log(res)

        if (res.code == 200) {
          let data = []
          res.rows.forEach((item, index) => {
            let obj = {
              lnglat: [item.gaodeX, item.gaodeY],
              name: item.vehicleno,
              id: index
            }
            data.push(obj)

          })

          this.$refs.mmap.drawPoint(data)

        }
      });


    }
  },

  mounted() {
    this.drawLine()


  }

}
</script>

<style>

</style>
