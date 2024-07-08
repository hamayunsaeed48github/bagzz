package com.example.fashionbag.dataclass

import com.example.fashionbag.R

data class HomeData(
    val id:Int,
    val image:Int,
    val name:String,
    val description:String,
)

object PurseRepositry{
    val purseList = listOf<HomeData>(
        HomeData(
            id = 1,
            image = R.drawable.bag_1,
            name = "Louis Vuitton",
            description = "Louis Vuitton, founded in 1854, is renowned for its luxury leather goods and signature monogram canvas. The brand's purses are iconic, known for their timeless designs and craftsmanship that blends tradition with innovation. Louis Vuitton purses often feature elegant details like the LV monogram, high-quality leather, and meticulous stitching, making them a symbol of status and sophistication in the fashion world."
        ),
        HomeData(
            id = 2,
            R.drawable.bag_2,
            name = "Gucci",
            description = "Gucci, established in Florence in 1921, is celebrated for its bold and eclectic style. Gucci purses are characterized by their distinctive designs, often incorporating the iconic GG logo, vibrant colors, and luxurious materials. Each Gucci purse reflects the brand's heritage of Italian craftsmanship and contemporary flair, appealing to fashion-forward individuals seeking both elegance and statement-making style."
        ),
        HomeData(
            id = 3,
            image = R.drawable.bag_3,
            name = "Prada",
            description = "Founded in Milan in 1913, Prada is synonymous with understated luxury and modern elegance. Prada purses are known for their minimalist designs, fine craftsmanship, and use of high-quality materials like Saffiano leather. With a focus on clean lines and sophisticated details, Prada purses effortlessly blend classic style with contemporary trends, making them a timeless choice for discerning fashion enthusiasts."
        ),
        HomeData(
            id = 4,
            image = R.drawable.bag_4,
            name = "Chanel",
            description = "Chanel, founded by Coco Chanel in Paris in 1910, is renowned for its timeless elegance and iconic designs. Chanel purses, including the classic 2.55 flap bag, are synonymous with luxury and sophistication. Crafted with meticulous attention to detail and featuring the signature quilting, interlocking CC logo, and chain strap, Chanel purses are coveted by fashion connoisseurs worldwide for their impeccable craftsmanship and enduring allure."
        ),
        HomeData(
            id = 5,
            image = R.drawable.bag_5,
            name = "Hermes",
            description = " Hermes, established in Paris in 1837, is famed for its impeccable craftsmanship and dedication to luxury. Hermes purses, such as the Birkin and Kelly bags, are crafted from the finest materials like Togo or Epsom leather and adorned with the brand's iconic hardware. Known for their exclusivity and meticulous attention to detail, Hermes purses embody timeless elegance and are a symbol of prestige and refinement in the fashion industry."
        ),
        HomeData(
            id = 6,
            image = R.drawable.bag_6,
            name = "Michael Kors",
            description = "Michael Kors, founded in 1981, offers a blend of luxury and accessibility in its purse collections. Michael Kors purses are known for their chic designs, often featuring the MK logo, premium materials, and practical yet stylish details. Catering to modern lifestyles, Michael Kors purses combine classic aesthetics with contemporary trends, appealing to fashion-conscious individuals seeking both functionality and fashion-forward style."
        ),
        HomeData(
            id = 7,
            image = R.drawable.bag_7,
            name = "Coach",
            description = "Coach, established in New York City in 1941, is recognized for its American heritage and craftsmanship. Coach purses are characterized by their classic designs, fine leather craftsmanship, and distinctive details like the iconic Coach logo. With a focus on quality and timeless appeal, Coach purses embody understated luxury and everyday sophistication, making them a popular choice among fashion enthusiasts worldwide."
        ),
        HomeData(
            id = 8,
            image = R.drawable.bag_8,
            name = "Kate Spade",
            description = " Kate Spade New York, founded in 1993, is known for its playful and feminine designs. Kate Spade purses are characterized by vibrant colors, graphic prints, and whimsical details that reflect the brand's upbeat and youthful spirit. Crafted from high-quality materials and featuring functional designs, Kate Spade purses effortlessly blend style with practicality, appealing to individuals who appreciate a mix of sophistication and modern charm."
        )
    )

    fun getHomeData(id: Int) = purseList.firstOrNull{
        it.id==id
    }
}