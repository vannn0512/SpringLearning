<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>商品详情</title>
    <style type="text/css">
        @import url(/static/background.css);
    </style>
</head>

<body>
<p class="grad">
<#if tempGood??>
<div class="goods">
    <h3>${tempGood.good}</h3>
    <div class="item">
        <span class="tip">价格</span>￥${tempGood.money}<br>
        <span class="tip">数量</span>${tempGood.number}<br>
        <span class="tip">日期</span>${tempGood.datetime?string('yyyy-MM-dd HH:mm:ss')}
    </div>
<div>
</#if>
</body>
</html>
