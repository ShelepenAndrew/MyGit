//var m = [4, 12, 34, "hello"];
//console.log(m[1])

var m = {};
var n = { 
    "one" : 12,
    "hello" : "world",
    "prim" : 2000,
    "double key" : 777
};
n.one = 9000;
//console.log(n["prim"]);
//console.log(n.one);
//console.log(n.double key); //ошибка из-за пробела в переменной
console.log(n["double key"]);

var ppp = "hello";
//n.ppp // ошибка
console.log(n[ppp]);

var out = document.getElementById("out");
for(var key in n){
    out.innerHTML += key + " ----- " +n[key]+ "<br> " ;
}