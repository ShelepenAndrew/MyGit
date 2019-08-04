function f1(){
    var p;
    p = document.getElementById("out");
    // заданное кол-во повторений
    // i++ i=i+1
    for (var i=1; i<=100; i=i+1){
        p.innerHTML +=i+ " ";
    }
}