package com.example.fashionbag.dataclass

import com.example.fashionbag.R


data class MenuData(
    val id:Int,
    val image:Int,
    val name:String,
    val description:String,
)

object MenuPurseRepositry{
    val menuPurseList = listOf<MenuData>(
        MenuData(
            id = 1,
            image = R.drawable.bag_a,
            name = "Evelyn Clutch",
            description = "The Evelyn Clutch is an elegant evening purse crafted from premium satin with a delicate lace overlay. Its sleek, compact design and subtle metallic clasp make it perfect for sophisticated occasions."
        ),
        MenuData(
            id = 2,
            image = R.drawable.bag_b,
            name = "Aria Tote",
            description = "The Aria Tote combines practicality with style, featuring a spacious interior, multiple pockets, and a chic leather finish. Ideal for everyday use, it offers both versatility and elegance."
        ),
        MenuData(
            id = 3,
            image = R.drawable.bag_c,
            name = "Sophia Satchel",
            description = "The Sophia Satchel is a timeless piece made from high-quality pebbled leather. Its structured shape, gold-tone hardware, and top-handle design exude classic charm and sophistication."
        ),
        MenuData(
            id = 4,
            image = R.drawable.bag_d,
            name = "Isabella Hobo Bag",
            description = "The Isabella Hobo Bag offers a relaxed, slouchy silhouette with soft, supple leather. Its roomy interior and comfortable shoulder strap make it perfect for casual, everyday wear."
        ),
        MenuData(
            id = 5,
            image = R.drawable.bag_e,
            name = "Chloe Crossbody",
            description = "The Chloe Crossbody is a stylish and compact purse designed for on-the-go convenience. Made from durable faux leather, it features multiple compartments and an adjustable strap for versatile carrying options."
        ),
        MenuData(
            id = 6,
            image = R.drawable.bag_f,
            name = "Gabriella Wristlet",
            description = "The Gabriella Wristlet is a chic accessory for minimalists, crafted from luxurious suede with a secure zip closure. Its detachable wrist strap allows for easy carrying, making it perfect for nights out."
        ),
        MenuData(
            id = 7,
            image = R.drawable.bag_g,
            name = "Luna Bucket Bag",
            description = "The Luna Bucket Bag combines boho charm with modern functionality. Made from soft, textured leather, it features a drawstring closure and an adjustable shoulder strap, making it a versatile addition to any wardrobe."
        ),
        MenuData(
            id = 8,
            image = R.drawable.bag_h,
            name = "Valentina Shoulder Bag",
            description = "The Valentina Shoulder Bag is an elegant accessory with a sleek, streamlined design. Crafted from smooth, polished leather, it features a single shoulder strap and a spacious interior, perfect for both day and night."
        ),
        MenuData(
            id = 9,
            image = R.drawable.bag_i,
            name = "Elena Envelope Clutch",
            description = "The Elena Envelope Clutch is a sophisticated evening bag with a slim, minimalist design. Made from high-quality vegan leather, it features a magnetic flap closure and a discreet interior pocket for essentials."
        ),
        MenuData(
            id = 10,
            image = R.drawable.bag_j,
            name = "Mila Mini Backpack",
            description = "The Mila Mini Backpack is a trendy and practical purse for modern women. Its compact size, adjustable straps, and multiple pockets make it perfect for carrying daily essentials with style."
        ),
        MenuData(
            id = 11,
            image = R.drawable.bag_k,
            name = "Scarlett Bag",
            description = "The Scarlett Belt Bag offers hands-free convenience with a touch of glamour. Made from quilted leather, it features an adjustable belt strap and a secure zip closure, ideal for festivals or casual outings."
        ),
        MenuData(
            id = 12,
            image = R.drawable.bag_l,
            name = "Bianca Top-Handle Bag",
            description = "The Bianca Top-Handle Bag exudes vintage elegance with its structured shape and polished gold hardware. Made from premium crocodile-embossed leather, it adds a touch of sophistication to any outfit."
        ),
        MenuData(
            id = 13,
            image = R.drawable.bag_m,
            name = "Nora Doctor Bag",
            description = "The Nora Doctor Bag is a modern take on a classic design, featuring a roomy interior, sturdy handles, and a detachable shoulder strap. Made from rich, full-grain leather, it offers timeless appeal and functionality."
        ),
        MenuData(
            id = 14,
            image = R.drawable.bag_n,
            name = "Amara Saddle Bag",
            description = "The Amara Saddle Bag is a stylish accessory with a curved silhouette and a front flap closure. Crafted from smooth, durable leather, it features an adjustable crossbody strap for versatile carrying."
        ),
        MenuData(
            id = 15,
            image = R.drawable.bag_o,
            name = "Daphne Frame Bag",
            description = "The Daphne Frame Bag combines retro charm with contemporary style. Its structured frame, kiss-lock closure, and elegant fabric exterior make it a standout piece for any occasion."
        ),
    )

    fun getMenuData(id: Int) = menuPurseList.firstOrNull{
        it.id==id
    }
}