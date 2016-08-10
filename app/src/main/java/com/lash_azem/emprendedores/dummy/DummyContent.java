package com.lash_azem.emprendedores.dummy;

import com.lash_azem.emprendedores.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    //private static final int COUNT = 25;

    static {
        addItem(new DummyItem("1",
                "Leños",
                "¿Anteojos de madera? ¿Por qué no? La madera demuestra su gran versatilidad y ese toque natural del cual carecen otros materiales.",
                R.drawable.local_lenos));
        addItem(new DummyItem("2",
                "Wear Bona Fide",
                "Collares de Tela Bona Fide, Diseñados y hechos a mano en Costa Rica",
                R.drawable.local_bonafide));
        addItem(new DummyItem("4",
                "Tijo",
                "Tijo es una marca costarricense de ropa. Nuestros productos son originales y cada prenda es exclusiva y numerada.",
                R.drawable.local_tijo));
        addItem(new DummyItem("5",
                "Plivertees",
                "Es una marca de StreetWear para hombre y mujer creados por el artista de Costa Rica Oliver Skinner en 2004.",
                R.drawable.local_pliver));
        addItem(new DummyItem("10",
                "11:11",
                "Es la búsqueda del balance, cuando todo está alineado. Es también la forma en que seres de otras dimensiones se comunican, los números y como resuenan en nosotros cuando se alinean en sus diferentes formas. La música es un regalo del universo. ",
                R.drawable.local_onceonce));
        addItem(new DummyItem("11",
                "NOMELLAMO",
                "Taller de creacion de Peluches. En nuestro laboratorio de monstruos y experimentos, surgen los NOMELLAMO, criaturas adorables, cargadas de intensidad, color, textura y particularidades que exaltan la personalidad y ternura que los caracteriza. ",
                R.drawable.local_nomellamo));
        addItem(new DummyItem("12",
                "Aromaflor",
                "Productos orgánicos certificados hechos en Costa Rica. Extractos botánicos y minerales con formulación profesional.",
                R.drawable.local_aromaflor));
        addItem(new DummyItem("13",
                "Nomada",
                "Si nos bañamos y secamos todos los días por qué no con arte y diseño?Useful -inspiring day a day designed paños con frases e imágenes que le shift el día.",
                R.drawable.local_nomada));
        addItem(new DummyItem("14",
                "Trash lifestyle",
                "Fabricamos accesorios de uso diario utilizando bolsas de plástico y lonas recicladas.\n" +
                        "Si usted tiene un accesorio TRASH, ayudó a tener un mundo más limpio. En sus diseños encuentra productos y bolsas plásticas que iban directo a la basura.",
                R.drawable.local_trash));
        addItem(new DummyItem("15",
                "Va de Nuevo",
                "Diseño de bolsos ecológicos a partir de cuero reciclado/\n" + "Ecologic bags from upcycled leather",
                R.drawable.local_vadenuevo));
        addItem(new DummyItem("16",
                "Pez",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem",
                R.drawable.local_pez));
        addItem(new DummyItem("17",
                "Cabeza de Vinil",
                "Rock n' Roll costarricense",
                R.drawable.local_cabezavinil));
        addItem(new DummyItem("18",
                "Cuero Papel y tijera",
                "En bolsos, carteras, maletines, libretas y accesorios se expresa con fuerza el carácter y la estética propia del cuero. Bolsos, Maletines, Carteras, Billeteras, Accesorios, Libretas, etc.",
                R.drawable.local_cueropapel));
        addItem(new DummyItem("19",
                "Nabruk",
                "A la venta en Atelier de Diseño Orgánico\n" +
                        "Escazú Centro\n" +
                        "De la Iglesia de San Miguel, 200 sur y 100 oeste ",
                R.drawable.local_nabruk));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }
    public static class DummyItem {
        public final String id;
        public final String name;
        public final String details;
        //public final String location;
        //public final String contacto;
        //public final String web;
        public final int cover;

        public DummyItem(String id, String name, String details, int cover) {
            this.id = id;
            this.name = name;
            this.details = details;
            //this.location = location;
            //this.contacto = contacto;
            //this.web = web;
            this.cover = cover;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
