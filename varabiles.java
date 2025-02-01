<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <<title>Document</title>
</head>
<body>
    <script>
        let age = prompt("Enter the age");
let citizen = prompt("Enter the citizenship");
let cTest = prompt("Citizenship result");

if((age >= 18) && (citizen=="Indian"||cTest =="Passed")){
    document.write("Can eligible for voting");
}
else{
    document.write("Cannot vote");
}
//     let discountCode = "SAVE10"; 
// let totalAmount = 100;  

// if (discountCode === "SAVE10") {
//   totalAmount -= totalAmount *0.01
//   console.log("Discount applied: 10%");
// } else if (discountCode === "SAVE20") {
//   totalAmount -= totalAmount * 0.20; 
//   console.log("Discount applied: 20%");
// } else if (discountCode === "WELCOME") {
//   totalAmount -= totalAmount * 0.15;
//   console.log("Discount applied: 15%");
// } else {
//   console.log("Invalid discount code");
// }


// console.log("Total after discount: $" + totalAmount.toFixed(2));
</script>
    <!-- div id="a">
        <h1>raghu</h1>
        <h1 id="re">uday</h1>
    </div>
    <div id="b">
        <h2>pramod</h2>
        <h2>reyansh</h2>
    </div>
    <script>
        let n=document.getElementById("a")
        let l=document.getElementById("re")
        console.log(l);
        n.removeChild(l)
    </script> -->
    <!-- <script>
        let n=document.createElement("h2")
        n.innerText="priya"
        let p=document.getElementById('a')
        let l=document.getElementById('r')
        p.insertBefore(n,l)
        let nn=document.createElement("h1")
        nn.innerText="vishnu"
        let pp=document.getElementById("a")
        let l=document.getElementById("n")
        pp.insertBefore(nn,l)
        console.log(p)
    </script> -->
        <!-- <div id="a">
        <h1>raghu</h1>
        <h1>uday</h1>
    </div>
    <div id="b">
        <h2>pramod</h2>
        <h2>reyansh</h2>
    </div>
    <script>
        let n=document.createElement("h2")
        n.textContent="priya"
        let p=document.getElementById('a')
        let l=document.getElementById('n')
        p.insertBefore(n,l)
        console.log(p)
    </script> -->
    //     <div id="a"> 
    //     <h1>sia</h1>
    //     <h1 id="r">ria</h1>
    // </div>
    // <div id="b">
    //     <h1>ram</h1>
    //     <h1>sam</h1>
    // </div>
    //     let n=document.createElement("h2")
    //     n.textContent="Rahul"
    //     let p=document.getElementById('a')
    //     let l=document.getElementById('r')
    //     p.insertBefore(n,l)
    //     console.log(p)
    </script>
</body>
</html>
