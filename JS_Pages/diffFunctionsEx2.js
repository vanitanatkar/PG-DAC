var name1 = 'vanita'
var city = 'selu'
var s = `Hello ${name1} , Welcome to ${city}`
var s1 = "Hello "+name1+" , Welcome to "+city

console.log(s,"\n",s1)
console.log(s.charAt(3))
console.log(s.length)
console.log(s.concat(' hope',' you are',' good'))   //s is immutable
console.log(s.toUpperCase())
console.log(s.toLowerCase())
console.log(s.slice(3,10))
console.log(s.split(' '))
console.log(s.split('e'))
console.log(s.substring(3,10))
console.log(s.endsWith('e',17))
console.log(s.endsWith('e'))
