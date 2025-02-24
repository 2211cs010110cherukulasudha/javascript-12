<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <style>
        .parent{
            display: flex;
            height: 100vh;
            gap: 20px;
            justify-content: space-evenly;
            align-items: center;
            flex-wrap: wrap-reverse;
        }
        .child{
            height: 200px;
            width: 200px;
            border: 1px solid black;
            color: white;
        }
        .c1{
            background-color: aqua;
        }
        .c2{
            background-color: blueviolet;
        }
        .c3{
            background-color: burlywood;
        }
    </style>
</head>
<body>
    <div class="parent">
        <div class="child c1"></div>
        <div class="child c2"></div>
        <div class="child c3"></div>

        <div class="child c1"></div>
        <div class="child c2"></div>
        <div class="child c3"></div>

        <div class="child c1"></div>
        <div class="child c2"></div>
        <div class="child c3"></div>
    </div>
    <!-- <style>
        .parent{
            display: flex;
        }
        .child{
            height: 200px;
            width: 200px;
            border: 1px solid black;
            color: white;
        }
        .c1{
            background-color: aqua;
        }
        .c2{
            background-color: blueviolet;
        }
    </style> -->
</head>
<body>
    <div class="parent">
        <div class="child c1"></div>
        <div class="child c2"></div>
    </div>
</body>
</html>
