package com.example.androiddevchallenge

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Animal

class DataSourceViewModel : ViewModel() {

    private val animalListObserver = MutableLiveData<List<Animal>>()

    fun getAnimalsFromSource(): LiveData<List<Animal>> {
        animalListObserver.value = generateAnimalList()
        return animalListObserver
    }

    private fun generateAnimalList(): List<Animal> {
        val animals = mutableListOf<Animal>()
        animals.add(
            Animal(
                "Rocky",
                "German Shepherd",
                "https://stylesatlife.com/wp-content/uploads/2015/11/Types-of-Dogs-1.jpg",
                "German Shepard got originated from Germany. This is a new breed of dog that originated in the year 1899. These are called as working dogs that are developed for herding sheep. A German dog has a lot of strength, obedient, intelligent, and very well trained. It is called the second-most popular breed of dog in the United States and fourth-most popular in the United Kingdom."
            )
        )
        animals.add(
            Animal(
                "Tony",
                "Bulldog",
                "https://stylesatlife.com/wp-content/uploads/2015/11/Types-of-Dogs-2.jpg",
                "The country of origin of a bulldog is from England and the United Kingdom. Bulldogs are even called British Bulldog and English bulldog. The average life span of a bulldog is 07 to 10 years. They have tiny nasal cavities and are sensitive to heat."
            )
        )
        animals.add(
            Animal(
                "Bozman",
                "Golden Retriever",
                "https://stylesatlife.com/wp-content/uploads/2015/11/Types-of-Dogs-3.jpg",
                "The golden retriever is originated from Scotland, United Kingdom, and England. It is very reliable, trustworthy, kind, and intelligent. Its height is for females varies from 55-57cm and male 58-61cm. Weight of male 29.5-34 kg and for females 25-32 kg."
            )
        )
        animals.add(
            Animal(
                "Poodle",
                "Poodle",
                "https://stylesatlife.com/wp-content/uploads/2015/11/Types-of-Dogs-4.jpg",
                "These are mostly seen in France and Germany. It is very active, alert, intelligent, faithful, and even trained. Height ranges from 35-45cm. It is a water type of dog. Poodles worn Best in the show in 1966 and 1982 and also awarded."
            )
        )
        animals.add(
            Animal(
                "Xixi",
                "Shih Tzu",
                "https://stylesatlife.com/wp-content/uploads/2015/11/Types-of-Dogs-5.jpg",
                "It got originated in china. Other names are Chinese Lion Dog and Chrysanthemum Dog. They are litter in size up to 1-8. Weight for both females and males varies from 8.8-16 lbs. Height is also the same for both ranges from 7.9-11 inches."
            )
        )
        animals.add(
            Animal(
                "Pug",
                "Pug Dog",
                "https://stylesatlife.com/wp-content/uploads/2015/11/Types-of-Dogs-6.jpg",
                "These are originated in China, and when migrated to Europe in the sixteenth century, it was well popularized. It was developed as a passion by Queen Victoria in the 19th century. Likewise, it was passed to the royal family."
            )
        )
        animals.add(
            Animal(
                "Mastiffur",
                "English Mastiff",
                "https://stylesatlife.com/wp-content/uploads/2015/11/Types-of-Dogs-7.jpg",
                "These dogs breed are originated from England. It is even called as Mastiff or Old English Ma tiff. Its coat is beautiful and smooth. These are calm, dignified, affectionate, courageous, and protective. Height varies between 70-91cm for both females and males. The weight of males is higher than females."
            )
        )
        animals.add(
            Animal(
                "Goli",
                "Border Collie",
                "https://stylesatlife.com/wp-content/uploads/2015/11/Types-of-Dogs-8.jpg",
                "Border Collie is developed for herding livestock of sheep at boarders. These are acrobatic, energetic, athletic, and smart. These are well known as a Scottish sheepdog. Death occurs due to cancer, old age, and cerebral vascular afflictions. On average, the life span is of 13-16 years."
            )
        )
        animals.add(
            Animal(
                "Dany",
                "English Cocker Spaniel",
                "https://stylesatlife.com/wp-content/uploads/2015/11/Types-of-Dogs-9.jpg",
                "It was originated in England. Also known as Cocker spaniel. It even called by pet names like Cocker and Cocker spaniel. It is an active sporting dog with good-natured. Cockers can be along with children, people, and other pets and dogs."
            )
        )
        animals.add(
            Animal(
                "Loin",
                "Pomeranian",
                "https://stylesatlife.com/wp-content/uploads/2015/11/Types-of-Dogs-10.jpg",
                "Pomeranian is named after region Pomeranian in central Europe. It is also called as Deutscher Spitz. Pet names are pompom, pom, and tumbleweed. These became popular by royal owners since the 18th century."
            )
        )
        animals.add(
            Animal(
                "Gilli",
                "Australian Cattle Dog",
                "https://stylesatlife.com/wp-content/uploads/2015/11/Types-of-Dogs-11.jpg",
                "As the name suggests, it got originated in Australia. It has multiple names like blue heeler, red heeler, cattle dog, and Queensland heeler. It weighs about 15-22 kg for both males and females. Height varies from 46-51cm for males and 43-48cm for females. It has a short and double coat."
            )
        )
        animals.add(
            Animal(
                "Bulldoger",
                "Bull Terrier",
                "https://stylesatlife.com/wp-content/uploads/2015/11/Types-of-Dogs-12.jpg",
                "It got originated from England. Other names are Bully Gladiator and English Bull Terrier. These are both independent and stubborn. Its height is 45-55cm and weighs 22-38 kg for the male. Its coat is short and dense."
            )
        )
        animals.add(
            Animal(
                "Chow",
                "Chow Chow",
                "https://stylesatlife.com/wp-content/uploads/2015/11/Types-of-Dogs-14.jpg",
                "This breed got originated in china and now known as “Fluffy Lion-dog.” Other names are Tang Quan and Dog of the Tang Quan. These dogs are found as guardians in front of Buddhist temples and places. These are mostly kept as pets. These are loyal, independent, quiet, and reserved."
            )
        )
        animals.add(
            Animal(
                "Hound",
                "Basset Hound",
                "https://stylesatlife.com/wp-content/uploads/2015/11/Types-of-Dogs-16.jpg",
                "It got originated from France and Great Britain. This is a short-legged breed dog of the hound family. Its nicknames are basset and hush puppies. The weight of males is 55-75 pounds and females 45-65 pounds."
            )
        )
        animals.add(
            Animal(
                "Vivian",
                "Alaskan Malamute",
                "https://stylesatlife.com/wp-content/uploads/2015/11/Types-of-Dogs-18.jpg",
                "It got originated from the United States Alaska. It is a large breed of domestic dog. Its haul is very freight because of this strength and endurance. The weight of the male is 55 kg, and the female is 38 kg. The height of the female is 61cm and male 70cm."
            )
        )

        return animals
    }
}