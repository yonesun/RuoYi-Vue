<template>
  <div id="container">
  </div>
</template>
<script>
import AMapLoader from "@amap/amap-jsapi-loader";
export default {
  name: "amap",
  props: {
    center: {
      type: Array,
      default: ()=>[121.905747,30.894496],
      // default: ()=>[116.39, 39.92],
    },
    zoom: {
      type: Number,
      default: 14,
    },
    path: {
      type: Array,
      default: ()=>[]
    },
    data: {
      type: Object,
      default: ()=>{}
    }
  },
  data() {
    return {
    };
  },

  methods:{
    drawPolyLine(){
      console.log(this.path)
      if(AMap){
        var polyline = new AMap.Polyline({
          path: this.path,          // 设置线覆盖物路径
          strokeColor: "#3366FF", // 线颜色
          strokeWeight: 5,        // 线宽
          strokeStyle: "solid",   // 线样式
          extData: this.data
        });
        this.map.add(polyline);
        polyline.on("click", this.polyClick);
      }


    },
    polyClick(e){
      console.log(e)
      console.log(e.target.getExtData())
    }

  },
  watch: {
    path: function (newVal, oldVal) {
      this.drawPolyLine();
    },
    deep: true,
    immediate: true
  },
  mounted() {
    AMapLoader.load({
      key: "0e3cd32e0bea1bf2575360713b2df0e7", // 申请好的Web端开发者Key，首次调用 load 时必填
      version: "2.0", // 指定要加载的 JSAPI 的版本，缺省时默认为 1.4.15
      plugins: ["AMap.Scale"], // 需要使用的的插件列表，如比例尺'AMap.Scale'等
    })
      .then((AMap) => {
        this.map = new AMap.Map("container", {
          // 设置地图容器id
          viewMode: "2D", // 是否为3D地图模式
          zoom: this.zoom, // 初始化地图级别
          center: this.center, // 初始化地图中心点位置
        });
      })
      .catch((e) => {
        console.log(e);
      });

  },

};
</script>
<style>
#container {
  width: 100%;
  height: 800px;
}
</style>
