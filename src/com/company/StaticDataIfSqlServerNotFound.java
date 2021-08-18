package com.company;

import com.company.model.Drug;
import com.company.model.Patient;
import com.company.model.User;

public class StaticDataIfSqlServerNotFound {

    static User[] getUsers() {
        return new User[]{
                new User("0", "0", true),
                new User("amr", "Amr@2020", true),
                new User("ayman", "a_2001", true),
                new User("magda", "0", true),
                new User("fatma", "0", true),
        };
    }

    static Drug[] getDrugs() {
        return new Drug[]{
                new Drug("PANADOL COLD & FLU DAY 24 TAB", 27, "30/09/2022", 15524501, "Medications"),
                new Drug("ALCOHOL 70% 100 ML", 18, "20/06/2025", 15524502, "Sanitizers / Hand Gel"),
                new Drug("C-RETARD ( VITAMIN C ) 500 MG 10 CAP", 16, "01/01/2024", 15524503, "VITAMIN / Immunity Enhancer"),
                new Drug("OMEGA – 3 – PLUS 30 CAP", 41.75, "20/06/2025", 15524504, "Medicines for regulating blood fats / Immunity Enhancer"),
                new Drug("GARNIER BY NUTRISSE H.COLOR CR. 7.11", 55, "12/12/2023", 15524505, "Hair Care"),
                new Drug("ORAL-B 40 ULTRA THIN BLACK SOFT (2×1)", 53, "30/09/2022", 15524506, "Toothbrush"),
                new Drug("ASPIRIN PROTECT 100 MG 20 TAB", 21, "20/06/2025", 15524507, "Medications / blood"),
                new Drug("VASELINE PURE PETROLEUM JELLY 50ML ORGINAL", 21, "12/12/2023", 15524508, "Body Moisturizers"),
                new Drug("CALCIUM CARBONATE", 59, "30/09/2022", 15524509, "VITAMIN / Immunity Enhancer"),
                new Drug("ASPOCID 75 MG 20 TAB", 6, "20/06/2025", 15524510, "Medications"),
                new Drug("HEAD&SHOULDERS DANDRUFF SH. 400ML MENTHOL", 48, "01/01/2024", 15524511, "Hair Care"),
                new Drug("PLETAAL 50 MG 20 TAB", 70, "11/03/2023", 15524512, "Medications"),
                new Drug("SENSODYNE TOOTHPASTE 50GM MULTI CARE & WHITENING", 33, "20/06/2025", 15524513, "Toothpaste"),
                new Drug("STROKA 75 MG 30 TAB", 145, "30/09/2022", 15524514, "Medications"),
                new Drug("CORASORE 150 MG 20 TAB", 16, "01/01/2024", 15524515, "Medications"),
                new Drug("LUX SHW.GEL250ML MAGICAL BEAUTY", 33, "11/03/2023", 15524516, "Body Care"),
                new Drug("VIDROP (VITAMIN – D3) ORAL DROPS 15 ML", 10.5, "30/09/2022", 15524517, "VITAMIN / Immunity Enhancer"),
                new Drug("COMTREX ACUTE HEAD COLD 20 TAB", 30, "11/03/2023", 15524518, "Medications / RESPIRATORY DRUGS"),
                new Drug("LUNA SUN TAN OIL SPR. 130ML SPF15", 92, "20/06/2025", 15524519, "Sun Care"),
                new Drug("ORLY 120 MG 30 CAP", 97.5, "01/01/2024", 15524520, "WEIGHT LOSS AND WEIGHT CONTROL DRUGS"),
                new Drug("DIET SWEET 100 TAB", 13, "11/03/2023", 15524521, "WEIGHT LOSS AND WEIGHT CONTROL DRUGS"),
                new Drug("ANTIFLU 20 CAP", 12.75, "30/09/2022", 15524522, "Medications / RESPIRATORY DRUG"),
                new Drug("FA DEOD SPR. 150ML WHITENING CARE", 48.25, "11/03/2023", 15524523, "Body Care"),
                new Drug("NIGHT CALM 3 MG 20 TAB", 33, "01/01/2024", 15524524, "MEDICINES AFFECTING THE NERVOUS SYSTEM"),
                new Drug("BIVATRACIN 150 ML POWDER SPRAY", 36, "20/06/2025", 15524525, "TOPICAL PREPARATIONS")
        };
    }

    static Patient[] getPatients() {
        return new Patient[]{
                new Patient("Zarah", "Pound", 20, "Hydrocortisone", "50 Longview Road", "Garvin Labrone", "15/05/2021", 3),
                new Patient("Yulma", "Bondar", 33, "Tirosint", "6657 Mallory Circle", "Gunner Kimm", "01/03/2020", 4),
                new Patient("Rene", "Leatherbarrow", 67, "Modesa", "17523 Burrows Hill", "Ricki Liddy", "26/12/2019", 5),
                new Patient("Berri", "Melarkey", 47, "Cold and Hot Medicated", "1 Summit Junction", "Claybourne Hamson", "26/10/2018", 6),
                new Patient("Almeta", "Mahody", 65, "Potassium Chloride", "772 Bellgrove Plaza", "Lona Coole", "22/12/2020", 7),
                new Patient("Arnie", "Rains", 91, "Oxygen", "71 Drewry Way", "Trenna Tilly", "03/05/2020", 8),
                new Patient("Clair", "Downe", 77, "Yellow Dock", "3270 Eggendart Point", "Nicko Balfour", "18/05/2021", 9),
                new Patient("Erick", "Ruspine", 20, "Ranitidine Hydrochloride", "85 David Court", "Amye Dye", "11/11/2020", 10),
                new Patient("Corbie", "Vasyunkin", 55, "Sun Essential", "528 International Parkway", "Randi Casin", "23/11/2020", 11),
                new Patient("Jayme", "Jinkinson", 72, "Citalopram", "25253 Sauthoff Parkway", "Zena Sayle", "09/06/2019", 12),
                new Patient("Dolorita", "Haller", 91, "Buspirone HCl", "1585 Thackeray Plaza", "Cody Well", "13/04/2021", 13),
                new Patient("Dietrich", "Renison", 80, "Levocarnitine", "554 Golf View Parkway", "Lonee Kennally", "06/03/2019", 14),
                new Patient("Trent", "Keeping", 57, "AMOREPACIFIC", "89 Nobel Avenue", "Luce Nevinson", "20/04/2021", 15),
                new Patient("Danya", "Maude", 40, "Omeprazole", "400 Brickson Park Point", "Sascha Waddy", "14/02/2020", 16),
                new Patient("Pernell", "Aronstein", 75, "Dexamethasone", "99 Old Shore Crossing", "Birdie Somerscales", "04/03/2020", 17),
                new Patient("Emlynne", "Skull", 28, "CARBAMAZEPINE", "6 Pankratz Trail", "Edik Garrould", "02/12/2020", 18),
                new Patient("Lissy", "Frame", 5, "Papaverine Hydrochloride", "880 Crest Line Lane", "Vina Jansen", "09/12/2020", 19),
                new Patient("Harwilll", "Tant", 79, "Calamine", "1413 Calypso Trail", "Flinn Balk", "16/01/2020", 20),
                new Patient("Noam", "Bance", 59, "advanced firming and anti wrinkle", "55 Mcbride Junction", "Fletcher Bouzan", "16/12/2019", 21),
                new Patient("Monte", "Coffee", 94, "Strawberry", "6766 Meadow Vale Court", "Ilysa Leport", "15/01/2019", 22),
                new Patient("Farlie", "Ironmonger", 29, "Algenist", "315 Trailsway Alley", "Doralyn Kitley", "09/04/2021", 23),
                new Patient("Petra", "Lamberteschi", 83, "CEFAZOLIN", "3 Green Ridge Hill", "Amalle Riedel", "12/02/2020", 24),
                new Patient("Jimmie", "Sarle", 18, "Sochlor", "3735 Schiller Center", "Jasun Gerant", "25/05/2019", 25),
                new Patient("Ilaire", "Pacitti", 21, "Quality Choice", "967 Mcguire Point", "Sheelah McGaugan", "10/09/2019", 26),
                new Patient("Lucius", "Benton", 71, "Ultra-TechneKow", "33 Anhalt Lane", "Kile Form", "08/01/2020", 27),
        };
    }
}