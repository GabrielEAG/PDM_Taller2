package com.agarcia.GabrielAguilar_00181423.data.dummy

import com.agarcia.GabrielAguilar_00181423.data.model.Restaurant
import com.agarcia.GabrielAguilar_00181423.data.model.MenuItem

val dummyRestaurants = listOf(
  Restaurant(
    id = 1,
    name = "Taco Loco",
    description = "Tacos auténticos mexicanos con ingredientes frescos.",
    category = "Comida Mexicana",
    backdropUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTreiLXxsbulP8CB7sP476kA2ifWXPC_p1gcA&s",
    imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTreiLXxsbulP8CB7sP476kA2ifWXPC_p1gcA&s",
    menu = listOf(
      MenuItem(1, "Taco de Carne Asada", "Con guacamole y salsa roja", "https://familiakitchen.com/wp-content/uploads/2021/01/iStock-960337396-3beef-barbacoa-tacos-e1695391119564.jpg"),
      MenuItem(2, "Burrito de Pollo", "Envueltos en tortilla grande con arroz", "https://cdn7.kiwilimon.com/brightcove/8631/640x640/8631.jpg.webp")
    )
  ),
  Restaurant(
    id = 2,
    name = "Pasta Bella",
    description = "Especialistas en cocina italiana tradicional.",
    category = "Comida Italiana",
    backdropUrl = "https://img.freepik.com/vector-premium/patron-creativo-espagueti-o-pasta-logo-vector-ilustracion-simple-plantilla-icono-diseno-grafico-fideos-signo-o-simbolo-restaurante-o-concepto-menu-placa-tipografia_530080-877.jpg",
    imageUrl = "https://img.freepik.com/vector-premium/patron-creativo-espagueti-o-pasta-logo-vector-ilustracion-simple-plantilla-icono-diseno-grafico-fideos-signo-o-simbolo-restaurante-o-concepto-menu-placa-tipografia_530080-877.jpg",
    menu = listOf(
      MenuItem(3, "Spaghetti Bolognese", "Salsa de carne y tomate", "https://mercadoventas.es/wp-content/uploads/2024/09/receta-de-pasta.jpg"),
      MenuItem(4, "Lasagna Clásica", "Capas de pasta, carne y queso", "https://www.lavanguardia.com/files/article_main_microformat/files/fp/uploads/2020/09/09/5f58b1bb6d322.r_d.627-418-0.jpeg")
    )
  ),
  Restaurant(
    id = 3,
    name = "Pasta no tan Bella",
    description = "Especialistas en cocina italiana.",
    category = "Comida Italiana",
    backdropUrl = "https://img.freepik.com/vector-premium/diseno-logotipo-espagueti-italiano-tenedor-pasta-logotipo-restauracion-gastronomia_661039-2490.jpg?semt=ais_hybrid&w=740",
    imageUrl = "https://img.freepik.com/vector-premium/diseno-logotipo-espagueti-italiano-tenedor-pasta-logotipo-restauracion-gastronomia_661039-2490.jpg?semt=ais_hybrid&w=740",
    menu = listOf(
      MenuItem(3, "Spaghetti Bolognese", "Salsa de carne y tomate", "https://mercadoventas.es/wp-content/uploads/2024/09/receta-de-pasta.jpg"),
      MenuItem(4, "Lasagna Clásica", "Capas de pasta, carne y queso", "https://alimentosdoria.com/wp-content/uploads/elementor/thumbs/banner-pasta-con-queso-1-1-q5i9eszb4jy1tjebvm3esf9gjpb3g9fdpsgo239ues.jpeg")
    )
  ),
  Restaurant(
    id = 4,
    name = "Burguer Queen",
    description = "Especialistas en Hamburguesas.",
    category = "Comida Rapida",
    backdropUrl = "https://i.pinimg.com/736x/17/2f/cc/172fcc6c37fa371017fcd0532c60339a.jpg",
    imageUrl = "https://i.pinimg.com/736x/17/2f/cc/172fcc6c37fa371017fcd0532c60339a.jpg",
    menu = listOf(
      MenuItem(3, "Hamburguesas Bolognese", "Salsa de carne y tomate", "https://d1uz88p17r663j.cloudfront.net/original/1d784711b27dd528e724bc5b0a3c0f83_pizz.png"),
      MenuItem(4, "Hamburguesa Clásica", "Capas de pasta, carne y queso", "https://png.pngtree.com/png-clipart/20240115/original/pngtree-cute-style-mini-burgers-png-image_14118296.png")
    )
  ),
  Restaurant(
    id = 5,
    name = "Sushi Loco",
    description = "Especialistas en cocina asiatica.",
    category = "Comida Asiatica",
    backdropUrl = "https://i.pinimg.com/736x/98/45/0e/98450e8298b56755cf863b7e40a1d2cc.jpg",
    imageUrl = "https://i.pinimg.com/736x/98/45/0e/98450e8298b56755cf863b7e40a1d2cc.jpg",
    menu = listOf(
      MenuItem(3, "Sushi", "Salsa de carne y tomate", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQXRc_hFCDzU7TnZeXNLRgMu_KekB0zRclOXQ&s"),
      MenuItem(4, "Sushi 2", "Capas de pasta, carne y queso", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQXRc_hFCDzU7TnZeXNLRgMu_KekB0zRclOXQ&s")
    )
  ),
  Restaurant(
    id = 6,
    name = "Otaku Ramen",
    description = "Especialistas en cocina asiatica.",
    category = "Comida Asiatica",
    backdropUrl = "https://cdn.textstudio.com/output/studio/template/preview/stamped/u/x/h/k/w0xkhxu.webp",
    imageUrl = "https://cdn.textstudio.com/output/studio/template/preview/stamped/u/x/h/k/w0xkhxu.webp",
    menu = listOf(
      MenuItem(3, "Spaghetti Bolognese", "Salsa de carne y tomate", "https://cdn.pixabay.com/photo/2019/01/23/17/44/ramen-3950790_960_720.png"),
      MenuItem(4, "Lasagna Clásica", "Capas de pasta, carne y queso", "https://media.istockphoto.com/id/1253822248/es/vector/comida-japonesa-ramen-ilustraci%C3%B3n-vectorial-de-estilo-de-dibujos-animados-aislado-sobre.jpg?s=1024x1024&w=is&k=20&c=isMaF5zi4PZk-c0_zqyLs-e0vmqEX1oZj1P20wKcQm0=")
    )
  ),
  Restaurant(
    id = 7,
    name = "Go Verde",
    description = "Especialistas en cocina saludable.",
    category = "Comida Saludable",
    backdropUrl = "https://i.pinimg.com/736x/17/2f/cc/172fcc6c37fa371017fcd0532c60339a.jpg",
    imageUrl = "https://i.pinimg.com/736x/17/2f/cc/172fcc6c37fa371017fcd0532c60339a.jpg",
    menu = listOf(
      MenuItem(3, "Spaghetti Bolognese", "Salsa de carne y tomate", "https://i.pinimg.com/736x/17/2f/cc/172fcc6c37fa371017fcd0532c60339a.jpg"),
      MenuItem(4, "Lasagna Clásica", "Capas de pasta, carne y queso", "https://i.pinimg.com/736x/17/2f/cc/172fcc6c37fa371017fcd0532c60339a.jpg")
    )
  ),
  Restaurant(
    id = 8,
    name = "Sweets & Treats",
    description = "Especialistas en postres.",
    category = "Postres",
    backdropUrl = "https://i.pinimg.com/736x/17/2f/cc/172fcc6c37fa371017fcd0532c60339a.jpg",
    imageUrl = "https://i.pinimg.com/736x/17/2f/cc/172fcc6c37fa371017fcd0532c60339a.jpg",
    menu = listOf(
      MenuItem(3, "Spaghetti Bolognese", "Salsa de carne y tomate", "https://i.pinimg.com/736x/17/2f/cc/172fcc6c37fa371017fcd0532c60339a.jpg"),
      MenuItem(4, "Lasagna Clásica", "Capas de pasta, carne y queso", "https://i.pinimg.com/736x/17/2f/cc/172fcc6c37fa371017fcd0532c60339a.jpg")
    )
  ),
  Restaurant(
    id = 9,
    name = "Tabernon",
    description = "Especialistas en bebidas.",
    category = "Bebidas",
    backdropUrl = "https://i.pinimg.com/736x/17/2f/cc/172fcc6c37fa371017fcd0532c60339a.jpg",
    imageUrl = "https://i.pinimg.com/736x/17/2f/cc/172fcc6c37fa371017fcd0532c60339a.jpg",
    menu = listOf(
      MenuItem(3, "Spaghetti Bolognese", "Salsa de carne y tomate", "https://i.pinimg.com/736x/17/2f/cc/172fcc6c37fa371017fcd0532c60339a.jpg"),
      MenuItem(4, "Lasagna Clásica", "Capas de pasta, carne y queso", "https://i.pinimg.com/736x/17/2f/cc/172fcc6c37fa371017fcd0532c60339a.jpg")
    )
  )
)
