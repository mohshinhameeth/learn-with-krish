const print = {
function1:function(){
    console.log('this is a function1', this);
},

function2: ()=>{
    console.log('this is function 2', this);
}
}
print.function1();
print.function2();