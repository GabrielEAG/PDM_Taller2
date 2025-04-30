package com.agarcia.myfirstandroidapp.data.repository.Movie

import com.agarcia.myfirstandroidapp.data.dummy.dummyRestaurants
import com.agarcia.myfirstandroidapp.data.model.Restaurant
import kotlinx.coroutines.delay

class MovieRepositoryImpl:MovieRepository {

  override suspend fun getMovies(): List<Restaurant> {
    delay(5000)
    return dummyRestaurants
  }
}