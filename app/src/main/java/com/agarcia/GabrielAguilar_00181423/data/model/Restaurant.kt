package com.agarcia.GabrielAguilar_00181423.data.model

data class Restaurant(
  val id: Int,
  val name: String,
  val description: String,
  val category: String,
  val backdropUrl: String,
  val imageUrl: String,
  val menu: List<MenuItem>
)

data class MenuItem(
  val id: Int,
  val name: String,
  val description: String,
  val imageUrl: String
)
