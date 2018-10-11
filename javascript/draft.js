class Person {
  constructor(name, dateOfBirth) {
    this._name = name;
    this._dateOfBirth = dateOfBirth;
    this.friends = [];
  }

  get sayName() {
    return this._name;
  }

  get sayDateOfBirth() {
    return this._dateOfBirth;
  }

  set changeName(name) {
    this._name = name;
  }

  addFriend(friend) {
    this.friends.push(friend);
  }

  numberOfFriends() {
    return this.friends.length;
  }

  moreOld() {
    var d = this._dateOfBirth;
    var result = this._friends.every(function(item, index, array) {
      return d < item._dateOfBirth;
    });

    if (result) console.log(this._name + ' est plus vieux que');
    else console.log(this._name + ' nest pas plus vieux que tous les amis');

    //var myFriends = this.sayFriends();
    //for (var myFriend in myFriends) {
    //if (myFriend.dateOfBirth < this.sayDateOfBirth) {
    //return false;
    //}
    //}
    //return true;
  }

  sayFriends() {
    console.log('Amis de ' + this._name + ' : ');
    this._friends.forEach(function(item, index, array) {
      item.sayName();
    });
    console.log('-----------');
    //return this.friends;
  }
}

var nicholas = new Person('Nicholas', 1960);
var franck = new Person('Franck', 1965);
var eric = new Person('eric', 1966);

nicholas.addFriend(eric);
franck.addFriend(eric);

var fred = new Person('Fred', 1980);
nicholas.addFriend(fred);
franck.sayFriends();
nicholas.sayFriends();
console.log(franck.numberOfFriends());
console.log(nicholas.numberOfFriends());
franck.moreOld();
nicholas.moreOld();
