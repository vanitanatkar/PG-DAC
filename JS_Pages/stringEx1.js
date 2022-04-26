let str = 'parade'  //primitive string type
console.log(typeof(str))

let str2 =  new String('marching')
console.log(typeof(str2))  //object

let str3 = new String('parade')
let str4 = new String('marching')

if(str3 == str)
console.log("same")
else
console.log("different")

//primitives values are checked
if(str2.valueOf() == str4.valueOf())
console.log("same")
else
console.log('different')


//references are checked
if(str2 == str4)
console.log('same')
else
console.log('different')