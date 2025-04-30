package com.agarcia.GabrielAguilar_00181423.data.repository.Movie

import com.agarcia.GabrielAguilar_00181423.data.model.Restaurant

interface MovieRepository {
  suspend fun getMovies(): List<Restaurant>
}