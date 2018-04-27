# luban
在Curzibn/Luban项目上迭代，增加功能：[Gif图片不压缩](https://github.com/zwping/luban/blob/master/luBanLibrary/src/main/java/top/zibin/luban/Checker.java)、[多图片压缩监听](https://github.com/zwping/luban/blob/master/luBanLibrary/src/main/java/top/zibin/luban/mvp/LubanImpl.java)。

[![JtiPack](https://jitpack.io/v/win.zwping/Luban.svg)](https://jitpack.io/#win.zwping/Luban)
[![JavaDoc](https://img.shields.io/badge/JavaDoc-Reference-orange.svg)](https://jitpack.io/com/github/zwping/Luban/v1.0/javadoc/)
[![Aar](https://img.shields.io/badge/aar-23.98kb-brightgreen.svg)](https://github.com/zwping/Luban/blob/master/Luban-lib-v1.0.aar?raw=true)
![Api](https://img.shields.io/badge/API-16%2B-brightgreen.svg)
![Author](https://img.shields.io/badge/%E4%BD%9C%E8%80%85-%E8%A9%B9%E6%96%87%E5%B9%B3-blue.svg)
[![License](https:git//camo.githubusercontent.com/fc8e0c80ec74887c0cbc124b5e8cec1009e6f596/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f6c6963656e73652d417061636865253230322e302d626c75652e7376673f7374796c653d666c6174)](http://www.apache.org/licenses/LICENSE-2.0.html)

> 使用方法：

1. root build: 
``` gradle
allprojects {
 repositories {
    jcenter()
    maven { url "https://jitpack.io" } //增加JitPack仓库地址
 }
}
```

2. app build: 

``` gradle
dependencies {
    implementation 'win.zwping:Luban:v1.1' //增加Luban POM相关信息
}
```

-----

###### 原项目[地址](https://github.com/Curzibn/Luban)
