package com.agarcia.myfirstandroidapp.data.repository.Movie

import com.agarcia.myfirstandroidapp.data.model.Restaurant

interface MovieRepository {
  suspend fun getMovies(): List<Restaurant>
}