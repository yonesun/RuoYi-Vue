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
      map: null
    };
  },

  methods:{
    initmap(){
      AMapLoader.load({
        key: "0e3cd32e0bea1bf2575360713b2df0e7", // 申请好的Web端开发者Key，首次调用 load 时必填
        version: "2.0", // 指定要加载的 JSAPI 的版本，缺省时默认为 1.4.15
        plugins: ["AMap.Scale", "AMap.GraspRoad", "AMap.MassMarks"], // 需要使用的的插件列表，如比例尺'AMap.Scale'等
      })
        .then((AMap) => {
          this.map = new AMap.Map("container", {
            // 设置地图容器id
            viewMode: "2D", // 是否为3D地图模式
            zoom: this.zoom, // 初始化地图级别
            center: this.center, // 初始化地图中心点位置
          });
          this.$emit("do")
        })
        .catch((e) => {
          console.log(e);
        });
    },

    drawPolyLine(obj){
        this.$nextTick(()=>{
          var polyline = new AMap.Polyline({
            path: obj.path,          // 设置线覆盖物路径
            strokeColor: "#B22222", // 线颜色
            strokeWeight: 3,        // 线宽
            strokeStyle: "solid",   // 线样式
            extData: [obj.id, obj.length]
          });
          this.map.add(polyline);
          polyline.on("click", this.polyClick);
        })
    },
    polyClick(e){
      alert(e.target.getExtData())
    },

    drawPoint(obj){

      this.$nextTick(()=>{
        var styleObject = {
          url: 'https://vdata.amap.com/icons/b18/1/2.png',  // 图标地址
          size: new AMap.Size(11,11),      // 图标大小
          anchor: new AMap.Pixel(5,5) // 图标显示位置偏移量，基准点为图标左上角
        }
        var massMarks = new AMap.MassMarks({
          zIndex: 5,  // 海量点图层叠加的顺序
          zooms: [3, 19],  // 在指定地图缩放级别范围内展示海量点图层
          style: styleObject  // 设置样式对象
        });

        // var point = new AMap.Marker({
        //   position: new AMap.LngLat(obj.point[0], obj.point[1]),          // 设置点覆盖物位置
        //   extData: "f"
        // });
        // massMarks.on("click", ()=>{
        //
        // });
        massMarks.setData(obj);
        console.log(massMarks)
        massMarks.setMap(this.map);
        // this.map.add(point);
        // point.on("click", this.polyClick);
      })
    }


  },

  mounted() {
    this.initmap()
  },

};
</script>
<style>
#container {
  width: 100%;
  height: 800px;
}
</style>
