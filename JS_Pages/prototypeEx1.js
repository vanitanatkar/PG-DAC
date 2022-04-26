 function Student(r,n,d){
    this.roll = r
    this.name = n
    this.dob = d 
}

Student.prototype.getDetailes = function(){return this.name+" "+this.dob+" "+this.roll+""}

var s1 = new Student(111,'puja','2022-11-12')
var s2 = new Student(112,'kiya','2022-11-13')
console.log(s1.getDetailes(),Object.getPrototypeOf(s1))
console.log(s2.getDetailes(),Object.getPrototypeOf(s2))



 /* Date.prototype.Month = function (d) {
    switch (d) {
        case 1: return "JAN"; break;
        case 2: return "FEB"; break;
        case 3: return "MAR"; break;
        case 4: return "APR"; break;
        case 5: return "MAY"; break;
        case 6: return "Jun"; break;
        case 7: return "July"; break;
        case 8: return "Aug"; break;
        case 9: return "SET"; break;
        case 10: return "OCT"; break;
        case 11: return "NOV"; break;
        case 12: return "DES"; break;
    }
}
var d = new Date(2022, 3, 27)
var c = d.getDate()
var w = d.getMonth()
console.log(d.Month(w + 1))
Object.getPrototypeOf(d)  */

/* let obj = { name: 'vanita', city: 'selu' }
let pro = { age: 25, qualification: 'BE' }
let pro2 = { hobby: 'reading' }
Object.setPrototypeOf(obj, pro)
Object.setPrototypeOf(pro, pro2)
//console.log(Object.getPrototypeOf(obj),Object.getPrototypeOf(pro),Object.getPrototypeOf(pro2))
console.log(obj.address, obj.hobby, obj.qualification, obj.name)
 */