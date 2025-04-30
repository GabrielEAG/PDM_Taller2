package com.agarcia.GabrielAguilar_00181423.data.repository.Movie

import com.agarcia.GabrielAguilar_00181423.data.dummy.dummyRestaurants
import com.agarcia.GabrielAguilar_00181423.data.model.Restaurant
import kotlinx.coroutines.delay

class MovieRepositoryImpl:MovieRepository {

  override suspend fun getMovies(): List<Restaurant> {
    delay(5000)
    return dummyRestaurants
  }
}