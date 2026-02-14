console.log("Hello JavaScript")
console.log("Good Morning")
let userName = "Shivam"
console.log(userName)
let lastName = "Patra"

for(let i = 0;i<20;i++){
    console.log(userName+" "+lastName)
}
a=10
b=20
let ch = 3
switch (ch) {
    case 1 :
        document.writeln("Total : "+(a+b));
        break;
        case 2 :
        document.writeln("Total : "+(a-b));
        break;
    case 3 :
        document.writeln("Total : "+(a*b))
        break;
    default:
        document.writeln("wrong choice");
        break;
}



var namArr = ["Aryan","Shivam","Pavan","Aashish"];
console.log(namArr)
namArr.push("Amit")
console.log(namArr)
for(n of namArr){
    console.log(n);
}

for(let i=0;i<namArr.length;i++){
    console.log(namArr[i])
}


var employees = [
    {empid:1000,name:"Madhu",Age:24},
    {empid:1000,name:"Pooja",Age:23},
    {empid:1000,name:"Sonia",Age:26},
    {empid:1000,name:"Sweety",Age:21},
    {empid:1000,name:"Shivam",Age:29}
];
document.writeln("<table border=1");
document.writeln("<tr><th>Employee ID</th><th>Employee name</th><th>Employee age</th></tr>");

for(e of employees){
    // console.log(e)
    console.log("Employee id:"+e.empid+"\t"+"Employee name:"+e.name +" \t "+ "Age:"+ e.Age);
    document.writeln(
        "<tr><td>" +
            e.empid + 
            "</td><td>"+
            e.name+
            "</td><td>"+
            e.Age+
            "</td></tr>"
    );
}
document.writeln("</table>")

function buttonClick(){
    let name = document.getElementById("name").value;
    alert("Hello"+name+" !"+" Good Morning");
    alert("Button Clicked");
    document.getElementById("a").innerHTML="Hello"+name;
    document.getElementById("b1").innerHTML="Button Clicked!";
    document.body.style.backgroundColor="lightBlue";

}