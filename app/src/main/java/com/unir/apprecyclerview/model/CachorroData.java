package com.unir.apprecyclerview.model;

import java.util.ArrayList;

public class CachorroData {

    public static ArrayList<Cachorro> getCachorros() {

        ArrayList<Cachorro> cachorros = new ArrayList<>();

        cachorros.add(new Cachorro(
                "Max",
                "Beagle",
                "Cão de porte médio conhecido por seu excelente olfato.",
                "https://images.dog.ceo/breeds/beagle/n02088364_11136.jpg"
        ));

        cachorros.add(new Cachorro(
                "Thor",
                "Golden Retriever",
                "Raça conhecida pelo comportamento amigável e sociável.",
                "https://images.dog.ceo/breeds/retriever-golden/n02099601_10.jpg"
        ));

        cachorros.add(new Cachorro(
                "Luna",
                "Husky",
                "Cão resistente e ativo, originalmente utilizado em regiões frias.",
                "https://images.dog.ceo/breeds/husky/n02110185_1469.jpg"
        ));

        cachorros.add(new Cachorro(
                "Bob",
                "Pug",
                "Cão de pequeno porte conhecido pelo focinho curto.",
                "https://images.dog.ceo/breeds/pug/n02110958_15626.jpg"
        ));

        cachorros.add(new Cachorro(
                "Mel",
                "Chihuahua",
                "Uma das menores raças de cães do mundo.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuGBNnjv3XlVBs0wo6jCIPT86XfvgC2UjgQpGVNOromw&s=10"
        ));

        cachorros.add(new Cachorro(
                "Simba",
                "Akita",
                "Raça japonesa conhecida por sua força e comportamento reservado.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQr0MLJtZkI3sUpuRHlTea29BTzOnRreR7ElpkR_L1k5w&s=10"
        ));

        return cachorros;
    }
}
