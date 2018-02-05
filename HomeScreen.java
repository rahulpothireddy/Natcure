package com.example.natcure.natcure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeScreen extends AppCompatActivity {
    ListView listView;
    String bodyPart;
    DatabaseHelper databaseHelper;
    String[] mobileArray = {"Hair", "Head", "Eyes", "Ears", "Nose", "Mouth", "Throat",
            "Chest", "Stomach", "Legs", "Bone", "Muscle", "Infection"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        databaseHelper=new DatabaseHelper(this);
        databaseHelper.insertPartsData("Hair");
        databaseHelper.insertPartsData("Head");
        databaseHelper.insertPartsData("Eyes");
        databaseHelper.insertPartsData("Ears");
        databaseHelper.insertPartsData("Nose");
        databaseHelper.insertPartsData("Mouth");
        databaseHelper.insertPartsData("Throat");
        databaseHelper.insertPartsData("Chest");
        databaseHelper.insertPartsData("Stomach");
        databaseHelper.insertPartsData("Legs");
        databaseHelper.insertPartsData("Bone");
        databaseHelper.insertPartsData("Muscle");
        databaseHelper.insertPartsData("Infection");
        //repeat the below statement for all the remedies of hair
        databaseHelper.insertRemedyData(1,"hair loss","eat curry leaves or curry powder two spoons daily,eat 2 eggs daily");
        databaseHelper.insertRemedyData(1,"dandruff","Apply lemon juice thrice a week");
        databaseHelper.insertRemedyData(1,"hair fall","apply oil made from natural resource(olive oil,cocnut oil)");
        databaseHelper.insertRemedyData(1,"dry hair","apply olive oil or mixture of eggs");
        databaseHelper.insertRemedyData(1,"itching","apply mixture of honey,egg,olive oil.");
        databaseHelper.insertRemedyData(1,"white hair","eat curry leaves, norish with oil daily");
        databaseHelper.insertRemedyData(1,"split ends","mix egg yolk in two spoons of olive oil and apply regularly");
        databaseHelper.insertRemedyData(1,"frizzy hair","mash an avacado and mix it with curd to apply the paste");
        databaseHelper.insertRemedyData(1,"greasy hair","mix two spoons of apple cider vinegar in water and wash hair with it");
        databaseHelper.insertRemedyData(1,"oily scalp","wash the scalp with water mixed and boiled with black tea leaves");
        databaseHelper.insertRemedyData(2,"headache","apply mint juice and then apply ice pack gently");
        databaseHelper.insertRemedyData(2,"migrain","eat a piece of ginger , eat fish (it contains omega 3)");
        databaseHelper.insertRemedyData(2,"sinus","take steam thrice a week ");
        databaseHelper.insertRemedyData(2,"blood clotting","meditation,icepack,2-3 bottles of water daily ");
        databaseHelper.insertRemedyData(2,"memory loss","meditation, eat almonds, cashew nuts etc ");
        databaseHelper.insertRemedyData(2,"flu","Try a decongestant spray for swollen stuffy nose ");
        databaseHelper.insertRemedyData(2,"nausea","try awarm cup of ginger tea  or sniff peppermint or lemon");
        databaseHelper.insertRemedyData(2,"dizziness","deep breathing and drinking lot of water helps");
        databaseHelper.insertRemedyData(2,"vomthings","take a spoon of cloves and boil it with water and drink it");
        databaseHelper.insertRemedyData(2,"lightheadedness","eat a snack that is high in carbhohydrate and sugar level");
        databaseHelper.insertRemedyData(3,"eyesight","eat 4-6carrots daily, eat foods that contain vitamin E,curry leaves etc");
        databaseHelper.insertRemedyData(3,"sqint","do exercise by seeing your tip of your nose for 2-3 minutes daily");
        databaseHelper.insertRemedyData(3,"eye allergy","put 2-3 drops of milk in eyes gently and then sleep and relax");
        databaseHelper.insertRemedyData(3,"blinking","wash eyes with cold water daily in the morning");
        databaseHelper.insertRemedyData(3,"conjuctive eyes","cover eyes using a spectacles, eat vitamin E foods,almonds,etc");
        databaseHelper.insertRemedyData(3,"black spots","apply alovera juice and finally wash it with cool water");
        databaseHelper.insertRemedyData(3,"red eye","blink your eyes in bucketof cool water than then rub with a warm cloth");
        databaseHelper.insertRemedyData(3,"cataract","splah with cold water daily and palm and then relax by closing your eyes for 10 min");
        databaseHelper.insertRemedyData(3,"tired eyes","close your eyes and relax,sleep.");
        databaseHelper.insertRemedyData(3,"bulging eyes","use green tea bags over eyes");
        databaseHelper.insertRemedyData(3,"eyelid twitchinng","drink less caffeine and get adequate sleep also apply warm compress to eyes");
        databaseHelper.insertRemedyData(4,"ear pain","put 2-3 drops of olive oil");
        databaseHelper.insertRemedyData(4,"ear swelling","compress with cloth dipped in warm water");
        databaseHelper.insertRemedyData(4,"fluids","take steam apply garlic paste externally");
        databaseHelper.insertRemedyData(4,"pus","put 2-3 drops of olive oil and tree oil.");
        databaseHelper.insertRemedyData(4,"itching","apply mixture of onion juice , salt,two pinch of apple vinegar gently");
        databaseHelper.insertRemedyData(4,"ear infection","put cotton ball in ear which is dipped in cider vinegar and alcohol");
        databaseHelper.insertRemedyData(4,"ear ache","put 2-3 drops of onion juice into effected ear 2-3 times a day");
        databaseHelper.insertRemedyData(4,"glue ear","put 2-3 drops of mullein oil or olive oil");
        databaseHelper.insertRemedyData(4,"ear allergy","take 2 drops of warm water or tea tree oil into itchy ear");
        databaseHelper.insertRemedyData(4,"ear pain after flying","once plane begins swallow several times and chew gum");
        databaseHelper.insertRemedyData(4,"ear bleeding","add water in eucalyptus oil and boil it to inhale the steam");
        databaseHelper.insertRemedyData(5,"block","inhale steam");
        databaseHelper.insertRemedyData(5,"mucus","smell fresh garlic,cloves   inhale steam");
        databaseHelper.insertRemedyData(5,"cold","drink hot herbal or green tea,take steam");
        databaseHelper.insertRemedyData(5,"sinus","meditation,warm compress");
        databaseHelper.insertRemedyData(5,"nasal conjestion","garlic,steam,warm water");
        databaseHelper.insertRemedyData(5,"nose pain","steam,smell onion");
        databaseHelper.insertRemedyData(5,"breathing problem","breathing exercises,drink 4-5 litres of water");
        databaseHelper.insertRemedyData(5,"allergy","take steam,warm compres and apply lemon juice gently");
        databaseHelper.insertRemedyData(5,"infection","smell fresh garlic,cloves,onion etc  ");
        databaseHelper.insertRemedyData(5,"sneezing","drin hot soup,take steam,eat spicy food");
        databaseHelper.insertRemedyData(5,"nose bleeding","wash head with cold water and smell onion");
        databaseHelper.insertRemedyData(6,"ulcer","apply sea salt ,gargle with hot water");
        databaseHelper.insertRemedyData(6,"pain	","apply mixture of warm water and baking soda.");
        databaseHelper.insertRemedyData(6,"mouth sores","mix alovera juice and warm water and then do gargling.");
        databaseHelper.insertRemedyData(6,"swelling","gargle with the mixture of alovera juice,honey and warm water");
        databaseHelper.insertRemedyData(6,"burning","apply honey and then gently apply ice cubes.");
        databaseHelper.insertRemedyData(6,"loose teeth","drink coconut milk. Brush with salt");
        databaseHelper.insertRemedyData(6,"cavity","brush with salt on toothpaste,eat freshh fruits. Eat food which have low sugar and carbohydrates");
        databaseHelper.insertRemedyData(6,"gum bleeding	","apply salt,turmeric and gargle with mouth freshner");
        databaseHelper.insertRemedyData(6,"gum swelling	","apply clove oil and after 20 min gargle with hot water.");
        databaseHelper.insertRemedyData(6,"bad smell","	eat 4-6 tulsi leaves after brushing.");
        databaseHelper.insertRemedyData(6,"tooth decay","clove oil,gargle with salt");
        databaseHelper.insertRemedyData(6,"tooth pain","brush with salt on toothpaste, gargle with hot water containg mouth freshner.");
        databaseHelper.insertRemedyData(6,"plaque","brush with baking soda on toothpaste,eat strawberries and tomatoes");
        databaseHelper.insertRemedyData(7,"infection","	eat 1-2 pieces of ginger and then gargle with hot water");
        databaseHelper.insertRemedyData(7,"swelling","gargle with salt water,drink turmeric mik");
        databaseHelper.insertRemedyData(7,"pain	","1 tbs of ginger juice+honey+1 squeezed lemon+1 cup of hot water");
        databaseHelper.insertRemedyData(7,"cough","milk with turmeric,ginger");
        databaseHelper.insertRemedyData(7,"tonsils","hot mik,basil leaves in hot water");
        databaseHelper.insertRemedyData(7,"thyroid","coconut oil,fish oil,vitamin D foods");
        databaseHelper.insertRemedyData(7,"hiccups","drink 7 sips of water continuosly at a strech");
        databaseHelper.insertRemedyData(7,"dry","drink mixture of llemon and honey juice on empty stomach");
        databaseHelper.insertRemedyData(7,"burning","drink plenty of liquids and don’t take scalding foods");
        databaseHelper.insertRemedyData(7,"sore throat","mix salt and baking soda and pour it into throat ,gargle it");
        databaseHelper.insertRemedyData(8,"chest pain","drink green tea ,hot water mixed with basil leaves");
        databaseHelper.insertRemedyData(8,"asthama","drink hot water with ginger in it");
        databaseHelper.insertRemedyData(8,"stroke","eat food that contain omega3 fatty acids,fish,no smoking");
        databaseHelper.insertRemedyData(8,"heart burn","drink hibiscus tea");
        databaseHelper.insertRemedyData(8,"conjestion","water mixture of onion +honey+lemon+ginger");
        databaseHelper.insertRemedyData(8,"cough","drink ginger tea,gargle with hotsalt water");
        databaseHelper.insertRemedyData(8,"heartbeat","jogging,drink 3-4 litres of water daily");
        databaseHelper.insertRemedyData(8,"chestcold","	salt water gargling and drink mixuture of lemon and honey water");
        databaseHelper.insertRemedyData(8,"infection","	drinking fluids and juices and avoiding smoking ");
        databaseHelper.insertRemedyData(8,"bronchitisv","add one spoon of honey to your tea every day will help");
        databaseHelper.insertRemedyData(9,"pain","drink warm waterthat contain sugar,lemon juice,ginger.Eat fennel seeds");
        databaseHelper.insertRemedyData(9,"acidity","eat pudina levaes,cloves.Drink butter mik and avoid spicy foods");
        databaseHelper.insertRemedyData(9,"indigestion","take alovera juice,tulsi and pudina leaves in boiled water");
        databaseHelper.insertRemedyData(9,"ulcer","coconut water,banana,cabbage,pepper,honey,apples");
        databaseHelper.insertRemedyData(9,"motions","eat mustard seeds,bananas. Avoid milk foods");
        databaseHelper.insertRemedyData(9,"infections","musturd seeds,ginger/black/green tea,herbal tincture,drink lemon juice");
        databaseHelper.insertRemedyData(9,"vomitings","	in a cup of boiling water add cinnamon and strain the water.");
        databaseHelper.insertRemedyData(9,"infections","drink a spoon of apple cider vinegar with any fruit juice before meals");
        databaseHelper.insertRemedyData(9,"stomach flu","boil a chopped ginger inn hotwater and strain this tea every day");
        databaseHelper.insertRemedyData(9,"stomach upset","add chamomile into boilng water and sip it slowly");
        databaseHelper.insertRemedyData(10,"weakness","apply icepack on effected area for 10-15 mins");
        databaseHelper.insertRemedyData(10,"numbness","	pack icecubes in thintowel and apply gently");
        databaseHelper.insertRemedyData(10,"throbbing","dip a cloth in hot water and then tie it to your legs");
        databaseHelper.insertRemedyData(10,"cramps","soak in legs in hot water that contain epsom salt for 15 min and repeat it thrice a week");
        databaseHelper.insertRemedyData(10,"pain","apply coconut oil on affected area and massage your legs for 15 mins");
        databaseHelper.insertRemedyData(10,"corns","apply papaya juice,soak your legs in hot water daily");
        databaseHelper.insertRemedyData(10,"swelling","do a salt water soak and treat yourself with a massage");
        databaseHelper.insertRemedyData(10,"water retention","reduce salt and sugar intake foods and increase pottasium rich foods");
        databaseHelper.insertRemedyData(10,"edema","elevate your legs or body and massage the swollen part");
        databaseHelper.insertRemedyData(10,"ankle swelling","try magnesium supplement (220mg) nearly a day");
        databaseHelper.insertRemedyData(10,"leg bleaching","apply a paste of aloe vera gel and potatoes,lemon.");
        databaseHelper.insertRemedyData(11,"less dense bones","getting enough calcium and vitamin D also get exercise");
        databaseHelper.insertRemedyData(11,"bone pain","splints or braces to support bones");
        databaseHelper.insertRemedyData(11,"loose joints","physical therapy and bracing along with medication");
        databaseHelper.insertRemedyData(11,"rickets","get enough sun rays for vitamin D as rickets remedy");
        databaseHelper.insertRemedyData(11,"bone weakness","regular exercise and control over emotions,metabolism ,bracing");
        databaseHelper.insertRemedyData(11,"enlarged bones","surgery and radiationn therapy of the pituitary");
        databaseHelper.insertRemedyData(11,"bone cancer	","by adding an edge to the deals of blood circulation and physical exercise like yoga");
        databaseHelper.insertRemedyData(11,"pain in thigh","avoidance of high impact activities like running,pain killing medication");
        databaseHelper.insertRemedyData(11,"bone deformities","pain management and physical therapy , regular exercise is important");
        databaseHelper.insertRemedyData(11,"injuries","surgery, drug therapy,surgical procedures along with nutrition and massage");
        databaseHelper.insertRemedyData(12,"welling joints","drink solution of warm water and teaspoon of apple cider vinegar");
        databaseHelper.insertRemedyData(12,"sprain","massaging the effected area with comfrey oil or put an icepack over it for 15min");
        databaseHelper.insertRemedyData(12,"strain","keep the injured part elevated and consume aspirin or ibuprofen");
        databaseHelper.insertRemedyData(12,"swelling","arnica balm or ointment can be used as cream or a compress for the effected area");
        databaseHelper.insertRemedyData(12,"elbow pain","rest the injured arm to ice the injury for roughly 15 min and straighten arm completely");
        databaseHelper.insertRemedyData(12,"numbness","wear a wrist splint at night to keep your wrist in neutral position");
        databaseHelper.insertRemedyData(12,"over stiffness","anti inflammatory medications such as ibuprofen and naproxen help in reducing pain");
        databaseHelper.insertRemedyData(12,"inflammation","	plaster can be applied for immobilization of foot and orthotics can be used");
        databaseHelper.insertRemedyData(12,"cyst","rest your knee joint and use compression bandages to support your knee joint");
        databaseHelper.insertRemedyData(12,"fatigue","embrace a healthy life style with no addictive habits,a balanced diet and lot of exercise");
        databaseHelper.insertRemedyData(12,"polio","eat a balanced diet ,stop smoking and decrease caffeine intake");
        databaseHelper.insertRemedyData(12,"fracture","donot eat red meat and avoid drinking colas and products containing caffeine");
        databaseHelper.insertRemedyData(13,"itching","add 2tbsp of baking soda to water and apply the paste to effected area and wash it");
        databaseHelper.insertRemedyData(13,"diarrhoea","add 3 tbsp of aloe vera gel to 1 glass of lukewarm water and drink it in the morning");
        databaseHelper.insertRemedyData(13,"colitis","take 1 glass of coconut water and mix drum stick juice drink it daily");
        databaseHelper.insertRemedyData(13,"dry cough","mix butter,suger and soaked almonds and eat it every morning and evening");
        databaseHelper.insertRemedyData(13,"wet cough","crush black peppermons,sugar candys,liquoirice powder into powder and eat it everyday");
        databaseHelper.insertRemedyData(13,"fever","boil a cup of water with 1tbsp of saffron and sip the mixture when it is hot everyday");
        databaseHelper.insertRemedyData(13,"tonsilitis","take 1 glass of hotmilk with turmeric powder and black pepper and drink it at bedtime");
        databaseHelper.insertRemedyData(13,"insect bites","crush a handful of basil leaves with turmeric powder and mix it and apply on infected area");
        databaseHelper.insertRemedyData(13,"chicken pox","take 200 g green peas and boil it in water and make it into paste and apply it on affected area ");
        databaseHelper.insertRemedyData(13,"yeast infection","apply coconut or cinnamon oil 2-3 times a day and apply the aloe vera gel on infected areas");
        databaseHelper.insertRemedyData(13,"fungal infection","apply some clove powder or clove oil directly on the skin that is effected it speeds healing process");
        //repeat the above statement with id= position of element in bodyPart array and its remedy
        listView = (ListView) findViewById(R.id.listView_body_parts);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.select_dialog_item, mobileArray);
        listView.setAdapter(adapter);
        transmitLists();
    }

    void transmitLists() {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                bodyPart = (String) listView.getItemAtPosition(i);
                Intent intent = new Intent(HomeScreen.this, InputScreen.class);
                intent.putExtra("bodypart", bodyPart);
                Bundle b = new Bundle();
                if (i == 0)
                    b.putStringArray("parts", new String[]{"hair loss", "dandruff", "hair fall", "dry hair", "itching",
                            "white hair",
                            "split ends",
                            "frizzy hair",
                            "greasy hair",
                            "oily scalp"});
                else if (i == 1)
                    b.putStringArray("parts", new String[]{
                            "headache",
                            "migrain",
                            "sinus",
                            "blood clotting",
                            "memory loss",
                            "flu",
                            "nausea",
                            "dizziness",
                            "vomthings",
                            "lightheadedness"});
                else if (i == 2)
                    b.putStringArray("parts", new String[]{
                            "eyesight",
                            "sqint",
                            "eye allergy",
                            "blinking",
                            "conjuctivitis",
                            "black spots",
                            "red eyes",
                            "cataract",
                            "tired eyes",
                            "swelling",
                            "eyelid twitching"});
                else if (i ==3)
                    b.putStringArray("parts", new String[]{
                            "ear pain",
                            "ear swelling",
                            "fluids",
                            "pus",
                            "ear infection",
                            "ear ache",
                            "glue ear",
                            "ear allergy",
                            "ear pain after flying",
                            "ear bleeding"});
                else if (i == 4)
                    b.putStringArray("parts", new String[]{
                            "block",
                            "mucus",
                            "cold",
                            "sinus",
                            "nasal conjestion",
                            "nose pain",
                            "breathing problem",
                            "allergy",
                            "infection",
                            "sneezing",
                            "nose bleeding"});
                else if (i == 5)
                    b.putStringArray("parts", new String[]{
                            "ulcer",
                            "pain",
                            "mouth sores",
                            "swelling",
                            "burning",
                            "loose teeth",
                            "cavity",
                            "glum bleeding",
                            "gum swelling",
                            "bad smell",
                            "tooth decay",
                            "tooth pain",
                            "plaque"});
                else if (i == 6)
                    b.putStringArray("parts", new String[]{
                            "infection",
                            "throat swelling",
                            "pain",
                            "cough",
                            "tonsils",
                            "thyroid",
                            "hiccups",
                            "dry",
                            "burning",
                            "sore throat"});
                else if (i == 7)
                    b.putStringArray("parts", new String[]{
                            "chest pain",
                            "asthama",
                            "stroke",
                            "heart burn",
                            "conjestion",
                            "cough",
                            "heart beat",
                            "chest cold",
                            "infection",
                            "bronchitis"});
                else if (i == 8)
                    b.putStringArray("parts", new String[]{
                            "pain",
                            "acidity",
                            "indigestion",
                            "ulcer",
                            "motions",
                            "infections",
                            "vomitings",
                            "stomach flu",
                            "stomach upset"});
                else if (i == 9)
                    b.putStringArray("parts", new String[]{
                            "weakness",
                            "numbness",
                            "throbbing",
                            "cramps",
                            "pain",
                            "corns",
                            "swelling",
                            "water eretention",
                            "edema",
                            "ankle swelling",
                            "leg bleaching"});
                else if (i == 10)
                    b.putStringArray("parts", new String[]{
                            "less dense bones",
                            "bone pain",
                            "loose joints",
                            "rickets",
                            "weakness",
                            "enlarged bones",
                            "bone cancer",
                            "pain in thighs",
                            "bone deformities",
                            "injuries"});
                else if (i == 11)
                    b.putStringArray("parts", new String[]{
                            "welling joints",
                            "sprain",
                            "strain",
                            "swelling",
                            "elbow pain",
                            "numbness",
                            "over stiffness",
                            "inflammation",
                            "cyst",
                            "fatigue",
                            "polio",
                            "fracture"});
                else if (i == 12)
                    b.putStringArray("parts", new String[]{
                            "itching",
                            "diarrhoea",
                            "colitis",
                            "dry cough",
                            "wet cough",
                            "fever",
                            "tonsilitis",
                            "insect bites",
                            "chicken pox",
                            "yeast infection",
                            "fungal infection"});


                //repeat the above elseif with i==element id for all body parts
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}
