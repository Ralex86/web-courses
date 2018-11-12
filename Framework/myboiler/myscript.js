//@flow
var triple = x => 3 * x;

//console.log(triple(2));

//var b = 2;
//function a() {
//var e = 5;
//console.log(b);
//console.log(c);
//console.log(d);
//console.log(e);
//}
//var c = 3;
//a();
//var d = 4;

// 3.3

function sum(x, y, z, t) {
  return add(x + y, z + t);
  function add(x, y) {
    return x + y;
  }
}

console.log(sum(1, 2, 3, 4));

// 3.4

var pow = (b, n) => Math.pow(b, n);

// 3.5

function qu3_5(a, b, c) {
  return a * c(b);
}

// Appelez cette fonction avec des paramètres cohérents

console.log(qu3_5(1, 2, triple));

var inverse = s => {
  let split_string = s.split('');
  let reverse = split_string.reverse();

  return reverse.join('');
};

console.log(inverse('ESOPERESTEETSEREPOSE'));

console.log(inverse('Hello'));

var decalage = (s, offset) => {
  let temp = s.split('');
  for (var i = 0, len = s.length; i < len; i++) {
    temp[i] = String.fromCharCode(temp[i].charCodeAt(0) + offset);
  }

  temp = temp.join('');
  console.log(temp);
};

decalage('Alex', 3);
decalage('Je suis ton père', 3);

//
var arr = [
  {a: 1, b: 2},
  {a: 2, b: 4},
  {a: 9, b: 1},
  {a: 19, b: 29},
  {a: 187, b: 4},
];

//arr = arr.map(item => item.b);

//arr = arr.filter(item => item.a > 3);

console.log(arr);

var arr = [
  'Luke Skywalker',
  'Maître Yoda',
  'R2D2',
  'Padmé Amidala',
  'Anakin Skywalker',
  'Obi-Wan Kenobi',
];

var jedi = (arr /* arg1...argN arguments*/) => {
  return arr.reduce((accumulateur, valeurCourante, index, array) => {
    //if (arguments[index] !== undefined) {
    return accumulateur + ', ' + valeurCourante;
    //}
  }, '');
};

let chainejedi = jedi(arr, [0, 3, 4]);
//console.log(chainejedi);

let sans_jedi = arr
  .filter(item => !item.includes('Skywalker'))
  .reduce((acc, curr) => (acc != '' ? acc + ', ' + curr : curr), '');

console.log(sans_jedi);

// 6

var Realisateur = {
  nom: '',
  prenom: '',
  dateNaissance: null,
  init: function(nom, prenom, dateNaissance) {
    this.nom = nom;
    this.prenom = prenom;
    this.dateNaissance = dateNaissance;
  },
};

var Film = {
  titre: '',
  synopsys: '',
  annee: null,
  realisateur: new Object(Realisateur),

  init: function(titre, synopsys, annee, nom, prenom, dateNaissance) {
    this.titre = titre;
    this.synopsys = synopsys;
    this.annee = annee;
    this.realisateur.init(nom, prenom, dateNaissance);
  },

  decrire: function() {
    console.log(
      `Titre: ${this.titre}
Synopsys: ${this.synopsys}
Realisateur: ${this.realisateur.prenom} ${this.realisateur.nom}
Née le: ${this.realisateur.dateNaissance}\n`,
    );
  },
};

let titanic = Object.create(Film);
titanic.init(
  'Titanic',
  'A seventeen-year-old aristocrat falls in love with a kind but poor artist aboard the luxurious, ill-fated R.M.S. Titanic.',
  1997,
  'Cameron',
  'James',
  1954,
);

let interstellar = Object.create(Film);
interstellar.init(
  'Interstellar',
  'A team of explorers travel through a wormhole in space in an attempt to ensure humanitys survival',
  2014,
  'Nolan',
  'Christopher',
  1970,
);

let greenmile = Object.create(Film);
greenmile.init(
  'The Green Mile',
  'The lives of guards on Death Row are affected by one of their charges: a black man accused of child murder and rape, yet who has a mysterious gift.',
  1999,
  'Darabont',
  'Frank',
  1959,
);

console.log('Exo 6');
console.log('\n');

let films_arr = [titanic, interstellar, greenmile];

films_arr.forEach(film => film.decrire());
