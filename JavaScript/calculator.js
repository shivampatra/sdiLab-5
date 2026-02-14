function calc(buttonText){
    alert(buttonText);
    num1=parseInt(document.getElementById("t1").value);
    num2=parseInt(document.getElementById("t2").value);
    result=0;
   

    if(buttonText=="add") result=num1+num2;
    else if(buttonText=="sub") result=num1-num2;
    else if(buttonText=="mul") result=num1*num2;


    document.getElementById("res").innerHTML = "Result = "+result;
}