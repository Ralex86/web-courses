Vue.component('movie-item', {
  props: ['movie'],
  template: `
		<td>
			<input v-if="movie.edit" v-model="movie.title">
			<button v-if="movie.edit" v-on:click="saveMovie(index)">save</button>
			<span v-else>
				{{movie.title}}
			</span>
		</td>

		<td>
			{{movie.releaseDate}}
		</td>
		<td>
			{{movie.director}}
		</td>
		<td>
			{{movie.synopsis}}
		</td>
		<td>
			<button :disabled="movie.edit == true" v-on:click="editMovie(index)">edit</button>
			<button v-on:click="deleteMovie(index)">delete</button>
		</td>
	`,
  mounted() {
    console.log(this.movie);
  },
});

var app = new Vue({
  el: '#app',
  data: {
    search: '',
    message: 'Hello Vue!',
    counter: 0,
    display: true,
    movies: [
      {
        title: 'Rambo',
        releaseDate: 1998,
        director: 'Cameron James',
        synopsis: 'slknlkdlkdeljkedjledl',
        edit: false,
      },
      {
        title: 'interstellar',
        releaseDate: 1898,
        director: 'Steven Spielperg',
        synopsis: 'slknlkdlkdeljkedjledl',
        edit: false,
      },

      {
        title: 'bienvenue chez les chtis',
        releaseDate: 1789,
        director: 'Joseph Martin',
        synopsis: 'slknlkdlkdeljkedjledl',
        edit: false,
      },
    ],
  },
  methods: {
    increment() {
      this.counter++;
    },
    deleteMovie(index) {
      this.movies.splice(index, 1);
    },
    editMovie(index) {
      this.movies[index].edit = !this.movies[index].edit;
    },
    saveMovie(index) {
      this.movies[index].edit = !this.movies[index].edit;
    },
  },
  computed: {
    filteredMovies() {
      return this.movies.filter(
        item =>
          item.title.toLowerCase().includes(this.search.toLowerCase()) ||
          item.releaseDate.toString().includes(this.search) ||
          item.director.toLowerCase().includes(this.search.toLowerCase()),
      );
    },
  },
});
