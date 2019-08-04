function out()
{
    var p;
    p = document.getElementById("out");
    //p.innerHTML += "Hello!";
    
    //p.insertAdjacentHTML("beforeBegin","Hi")
    //beforeBegin - перед открывающимся тегом
    
    //p.insertAdjacentHTML("afterBegin","Hi")
    //afterBegin - после открывающего тега но перед солержимым
    
    //p.insertAdjacentHTML("beforeEnd","Hi")
    //beforeEnd - посел текста но перед тегом
    
    //p.insertAdjacentHTML("afterEnd","Hi")
    //afterEnd - посел текста и после тега
    
    p.outerHTML = '<div class = "one">hello</div>';
}