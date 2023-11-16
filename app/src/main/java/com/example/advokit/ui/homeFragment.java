package com.example.advokit.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.advokit.R;
import com.example.advokit.adapter.MyAdapter;
import com.example.advokit.adapter.hireAdapter;
import com.example.advokit.dataClass.DataClass;

import java.util.ArrayList;
import java.util.List;


public class homeFragment extends Fragment {
    RecyclerView recyclerView;
    List<DataClass> dataList;
    MyAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        List<DataClass> data = new ArrayList<>();
        recyclerView = view.findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new MyAdapter(getContext(), data));


        // photo strictly land
        // data.add(new DataClass("Narenda Modi","vatar",R.drawable.male_four));
//data.add (new DataClass("vatar",))
        /*
data.add(new DataClass("Criminal Case","SAibal bose khuni",R.drawable.dummy));
        data.add(new DataClass("BAL BOSE DEAD OR ALIVE?","A 25 Year old man shot dead \n" +
                "A surprising case has come from the narimore, Burdwan. 50 year old Mother in law fell in love"
              +  "with her son in law , The duo ran away after getting the father in law heavily intoxicated"

                ,R.drawable.dummy_two));

         */
// syntax (title, description , then photo) (photo landscape mandatory )


        data.add(new DataClass("Motor Vehicle Act 1988", "section-185,202:-On the time of driving in case your 100ml.blood contains more than 30mg. of alcohol then the police can arrest you with no warrant.", R.drawable.cons_one));
        data.add(new DataClass("Criminal Procedure Code","Section 46:-No Lady can't be arrested earlier than 6A.M and after 6 P.M.",R.drawable.cons_two));
        data.add(new DataClass("Indian Penal Code ","166 A :-A Police officer can't refuse to lodge an FIR if he/she does  in order that they may very well be jailed for as much as 6 months to 1yr", R.drawable.cons_fourteen));
        data.add(new DataClass("Indian Sarais Act , 1887","Even any 5-star hotel can't probhibit you from drinking potable water and utilizing its washrooms.",R.drawable.cons_four));
        data.add(new DataClass("Motor Vehicle Act ,1988", "As per part  129 of the Indian Motor Automobile Act, Sporting the helmet is a should for two-Wheeler riders. Part 128 of this motor Automobile Act ", R.drawable.cons_one));
        data.add(new DataClass("Home Violence Act,2005","If a younger  boy and a lady wish to stay collectively in a live -in relationship, they will achieve  this as a result of it is not lawful. Even the new child from this relationship can also be unauthorized son or daughter  and this new child have the complete ", R.drawable.cons_six));
        data.add(new DataClass("Police Act,1861","A police officer is at all times on obligation whether or not he/she sporting a uniform or not. If an individual makes a criticism to the officer ",R.drawable.cons_seven));
        data.add(new DataClass("Maternity Profit Act, 1961", "No firm can fireplace a pregnant lady . It could be punishable by a most of 3years of imprisonment ." ,R.drawable.cons_eight));
        data.add(new DataClass("Earning Tax Act,1961", "within the case of tax violations , the tax assortment officer has the ability to arrest you however earlier than arresting you,he/she  should ship a discover to you . solely Tax commissioner decides how lenghthy you all keep within the custody .", R.drawable.cons_nine));
        data.add(new DataClass("Hindu Marriage Act, part-13", "As per the Hindu marriage Act, 1955(any husband or spouse ) could apply for divorce within the court docket on the idea of adultery ", R.drawable.cons_ten));
        data.add(new DataClass("Code of Legal process,1973", "Solely ladies police constable can arrest ladies. Male constable doesn't  have the best to arrest ladies. Ladies have the best to disclaim  going to police  stations after the 6 P.M  and earlier at the 6 A.M.", R.drawable.cons_fourteen));
        data.add(new DataClass("As per citizen constitution (Indian oil company  web site )", " There  are only a few individuals who know that if their fuel cylinder blasts through the cooking of meals then the fuel company is liable to pay Rs. 50 lakh  to the sufferer as compensation ." , R.drawable.cons_twelve));
        data.add(new DataClass("Automotive(Modification) Invoice , 2016", "In case you are  are fined for against the law (like driving with not be helmet or some other cause ) then similar cause in the identical day",R.drawable.cons_three));
        data.add(new DataClass("Limitation Act, 1963", "In case your workplace doesn't pay you then you might have the ability to file an FIR towards  it inside 3 years. However for those who report after 3 years", R.drawable.cons_fifteen));
        data.add(new DataClass("Part 294 of the Indian Penal Code", "I In case you are discovered concerned in “obscene exercise” at a public place, you will be imprisoned for 3 months. However within the absence of a precise definition of obscene exercise police have at all times misused this act.", R.drawable.cons_eighteen));
        data.add(new DataClass("Hindu Adoption and Upkeep Act, 1956", "If any individual belongs to the Hindu faith and has a son or grandson then he can’t undertake a second youngster. There should be a niche of a minimum of 21 years between you (the adopter) and your  adopted son.", R.drawable.cons_seventeen));
        data.add(new DataClass("Indian Farmers Law 2020", " The Indian Farm Laws 2020 advert to the Farmer bills passed by the Lok Sabha on 17 September 2020 and by the Rajya Sabha on 20 September 2020. The bills, all in all, try to furnish ranchers with various advertising channels and give a lawful structure to ranchers to go into pre-masterminded contracts in addition to other things. The President of India, Ram Nath Kovind gave his consent for the three bills on 27 September 2020.", R. drawable.cons_sixteen));
        data.add(new DataClass("Right to Information (RTI) Act, 2005", "Section 1", R.drawable.cons_fourtynine));
        data.add(new DataClass("Right to Equality", "Article 14", R. drawable.twentytwo));
        data.add(new DataClass("Right to Education, 2009"," Act Article 21(A),Guarantees free education for children aged 6 to 14 since August 4, 2009.", R.drawable.cons_twentyfour));

        data.add(new DataClass("Right to File an FIR Section 154 of CrPC","Allows reporting crimes with recourse against denial.", R. drawable.cons_twentyseven));
        data.add(new DataClass("Right to Claim a Refund Consumer Protection Act, 1986", "Entitles consumers to full refunds",R.drawable.cons_twentynine));
        data.add(new DataClass("Most Retail Value Act, 2014", "Any store keeper can't cost greater than the printed value of any commodity however a shopper has the best to discount for lower than the printed value of a commodity.", R.drawable.cons_three));

        data.add(new DataClass("Equal Remuneration Act, 1976","Ensures equal pay for equal work.", R.drawable.twentytwo));

        data.add(new DataClass("Rights of a Woman When Arrested (Section 46 of CrPC)","Protected from arrest before sunrise or after sunset.", R.drawable.cons_thirtyfive));
        data.add(new DataClass("Right to Take Legal Action if Keys Snatched (Motor Vehicle Act of 1988)","Allows lawsuits against traffic police.", R.drawable.cons_twentyseven));
        data.add(new DataClass("Maternity Benefit Act of 1961 (Section 12)", "Prevents firing pregnant women, punishable with imprisonment.",R.drawable.cons_thirtyeight));
        data.add(new DataClass("Hindu Marriage Act, Section 13","Outlines groungs for divorce, including adultery,harassment, and impotence.", R.drawable.cons_ten));
        data.add(new DataClass("Income Tax Act of 1961", "Allows arrest for tax violations; duration determined by the Tax Commissioner.",R.drawable.cons_nine));
        data.add(new DataClass("Right to Information (RTI) Act, 2005, Section 1","Grants Indian citizens information access since October 12, 2005.", R.drawable.cons_fourtynine));

    }
}