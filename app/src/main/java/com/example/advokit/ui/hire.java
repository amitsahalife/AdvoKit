package com.example.advokit.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.advokit.R;
import com.example.advokit.adapter.hireAdapter;
import com.example.advokit.dataClass.Item;

import java.util.ArrayList;
import java.util.List;


public class hire extends Fragment {
    RecyclerView recyclerView;
    public hire() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feed, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        List<Item> items = new ArrayList<Item>();
        recyclerView = view.findViewById(R.id.recyler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new hireAdapter(getContext(),items));

      //  items.add(new Item(R.drawable.facebook_logo,"Amit Saha","Android Developer","Within 2 KM","Coffee | Coding | Friendship","Hi community! I am open to new connections ☺"));

       // items.add(new Item(,"amit","ss","ba",R.drawable.five_star,"ht"));
// TODO VANSHIKA
        items.add(new Item(R.drawable.male_two,"Aarav Sharma","123 Sunshine Avenue,\n" +
                "Mumbai, Maharashtra 400001","Bachelor of Laws (LLB)"
                ,4,"Accomplished Legal Advisor with a comprehensive background in corporate law and contract negotiation."
        ));
        items.add(new Item(R.drawable.female_one,"Ananya Kapoor","456 Garden Street,Delhi 110001","Juris Doctor (JD)"
                ,4,"Seasoned Legal Counsel known for providing strategic legal advice to ensure regulatory compliance"
        ));
        items.add(new Item(R.drawable.male_six,"Arjun Singh Chauhan","789 Harmony Lane,Ahmedabad, Gujarat 380001","Master of Laws (LLM) in Corporate Law"
                ,4,"Dynamic Legal Advisor specializing in employment law and dispute resolution."
        ));
        items.add(new Item(R.drawable.female_three,"Ayesha Patel","101 Serenity Road,Bangalore, Karnataka 56000","Bachelor of Arts in Law (BAL)"
                ,4,"Results-oriented Corporate Attorney with a track record of guiding businesses through complex legal matters."
        ));
        items.add(new Item(R.drawable.female_nine,"Ishita Chatterjee","3444 Zenith Street,\n" +
                "Ambala, Haryana 133001","Bachelor of Laws (LLB) in Employment Law\n" +
                "\n"
                ,4,"Results-driven Legal Advisor with a proven ability to navigate complex legal landscapes."
        ));
        items.add(new Item(R.drawable.male_five,"Bhavya Verma","3555 Serendipity Circle,\n" +
                "Tirunelveli, Tamil Nadu 627001\n","Master of Laws (LLM) in Constitutional Law\n" +
                "\n"
                ,4,"Proactive Legal Advocate with expertise in commercial litigation and arbitration."
        ));
        items.add(new Item(R.drawable.female_two,"Esha Gupta","3333 Blissful Boulevard,\n" +
                "Mangalore, Karnataka 575001\n","Juris Doctor (JD) in Health Law"
                ,4,"Versatile Corporate Attorney skilled in advising on labor and employment issues."
        ));
        items.add(new Item(R.drawable.female_seven,"Pooja Khanna","3111 Harmony Avenue,\n" +
                "Warangal, Telangana 506001\n","Legal Studies Certificate with a focus on Cyber Law\n" +
                "\n"
                ,4,"Accomplished Legal Analyst with a focus on international human rights law."
        ));
        items.add(new Item(R.drawable.female_five,"Natasha Mishra","1777 Tranquil Terrace,\n" +
                "Coimbatore, Tamil Nadu 641001\n" +
                "\n","Legal Studies Certificate with a specialization in Cybersecurity Law"
                ,4,"Seasoned Legal Specialist known for providing ethical and strategic legal advice.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.male_four,"Dinesh Kumar Yadav","2111 Serenity Road,\n" +
                "Madurai, Tamil Nadu 625001\n" +
                "\n","Bachelor of Laws (LLB) with a specialization in Health Law"
                ,4,"Proactive Legal Advocate with expertise in commercial litigation and arbitration."
        ));
        items.add(new Item(R.drawable.male_six,"Vivek Gupta","2999 Peaceful Lane,\n" +
                "Srinagar, Jammu and Kashmir 190001\n" +
                "\n","Legal Studies Certificate with a specialization in Cybersecurity Law"
                ,4,"Accomplished Legal Specialist known for providing clear and practical legal advice.\n" ));
                items.add(new Item(R.drawable.male_three,"Omkar Singh Rathore","3222 Tranquility Road, Nellore, Andhra Pradesh 524001\n" +
                        "\n","Master of Laws (LLM) in Tax Law\n" +
                        "\n",
                        4,"Detail-oriented Legal Consultant experienced in regulatory affairs."
                ));
        items.add(new Item(R.drawable.female_four,"Devika Reddy","3291 Tranquility Road, Nellore, Andhra Pradesh 524001\n" +
                "\n","Bachelor of Arts in Law (BAL) with a concentration in Environmental Law"
                ,4,"Proactive Legal Advocate with expertise in commercial litigation and arbitration.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.male_six,"Dinesh Kumar Yadav","888 Zenith Street,\n" +
                "Pune, Maharashtra 411001\n","Juris Doctor (JD) with a focus on Technology Law\n" +
                "\n"
                ,4,"Knowledgeable Legal Advisor specializing in real estate transactions and property law.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.feamle_six,"Prisha Mehra","667 Serendipity Circle, Thane, Maharashtra 400001\n" +
                "\n","Juris Doctor (JD) with a focus on Technology Law\n" +
                "\n"
                ,4,"Seasoned Legal Consultant with expertise in mergers and acquisitions.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.male_seven,"Surya Reddy" ,"3111 Harmony Avenue,\n" +
                "Warangal, Telangana 506001\n",""
                ,4,"Strategic Legal Officer skilled in labor law, ensuring fair and legal workplace practices.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.female_seven,"Vidya Nair" ,"828 Zenith Street,\n" +
                "Pune, Maharashtra 411001\n",""
                ,4,"Versatile Corporate Counsel with a proven ability to navigate complex legal issues."
        ));
        items.add(new Item(R.drawable.male_ten,"Rudra Sharma","3000 Serenity Road,\n" +
                "Kollam, Kerala 691001\n" +
                "\n","Bachelor of Arts in Law (BAL) with a concentration in Intellectual Property Law\n" +
                "\n"
                ,4,"Accomplished Legal Specialist known for providing clear and practical legal advice."
        ));
        items.add(new Item(R.drawable.female_ten,"Pooja Khanna","1555 Blissful Boulevard, Howrah, West Bengal 711001",""
                ,4,"Seasoned Legal Consultant with expertise in mergers and acquisitions.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.male_nine,"Utkarsh Verma" ,"890 Zenith Street,\n" +
                "Hyderabad, Telangana 500001\n","Juris Doctor (JD) with a focus on Technology Law\n" +
                "\n"
                ,4,"Versatile Legal Consultant skilled in analyzing legal risks and offering practical solutions.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.female_nine,"Tanvi Kapoor","111 Blissful Boulevard,\n" +
                "Pune, Maharashtra 411001\n" +
                "\n","Bachelor of Arts in Law (BAL) with a concentration in International Law"
                ,4,"Proactive Legal Advisor experienced in intellectual property law and trademark registration."
        ));
        items.add(new Item(R.drawable.male_eight,"Utkarsh Verma","667 Serendipity Circle, Thane, Maharashtra 400001\n" +
                "\n","Legal Studies Certificate with a specialization in Cybersecurity Law"
                ,4,"Detail-oriented Legal Specialist with expertise in drafting and reviewing legal documents.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.female_eight,"Sakshi Yadav"," Serendipity Circle,\n" +
                "Indore, Madhya Pradesh 452001\n","Bachelor of Arts in Law (BAL) with a concentration in International Law"
                ,4,"Strategic Legal Analyst with a focus on mitigating legal risks for organizations."
        ));
        items.add(new Item(R.drawable.male_seven,"Varun Gupta","2888 Blissful Boulevard,\n" +
                "Solapur, Maharashtra 413001\n","Bachelor of Laws (LLB) in Corporate Governance\n" +
                "\n"
                ,4,"Versatile Corporate Attorney skilled in advising on labor and employment issues."
        ));
        items.add(new Item(R.drawable.female_seven,"Riya Sen","2111 Serenity Road,\n" +
                "Madurai, Tamil Nadu 625001\n" +
                "\n","Bachelor of Laws (LLB) in Corporate Governance\n" +
                "\n",
                4,"Knowledgeable Legal Advisor specializing in real estate transactions and property law.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.male_one,"Amit Roy","393 Serendipity Circle, Thane, Maharashtra 400001\n" +
                "\n","Bachelor of Arts in Law (BAL) with a specialization in Human Rights Law"
                ,4,"Dedicated Legal Counsel experienced in advising on compliance issues and regulatory matters."
        ));
        items.add(new Item(R.drawable.male_two,"Vivaan Singh Choudhary","556 Blissful Boulevard,\n" +
                "Vadodara, Gujarat 390001\n" +
                "\n","Legal Studies Certificate in Real Estate Law"
                ,4,"Results-driven Legal Advocate adept at representing clients in negotiations and court proceedings.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.female_one,"Aditi Sharma","1666 Serendipity Circle,\n" +
                "Ranchi, Jharkhand 834001\n","Master of Laws (LLM) in Constitutional Law\n" +
                "\n",
                4,"Seasoned Legal Consultant with a strong background in international business law.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.feamle_six,"Tanvi Kapoor","1888 Zenith Street,\n" +
                "Kochi, Kerala 682001\n","Master of Laws (LLM) in Tax Law\n" +
                "\n",
                4,"Proactive Legal Advisor specializing in family law and dispute resolution.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.male_three,"Varun Verma","890 Zenith Street,\n" +
                "Hyderabad, Telangana 500001\n","Juris Doctor (JD) with a focus on Technology Law\n" +
                "\n"
                ,4,"Accomplished Legal Specialist known for providing clear and practical legal advice.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.male_nine,"Abhay Singh Rathore","2444 Blissful Boulevard,\n" +
                "Dhanbad, Jharkhand 826001\n","Master of Laws (LLM) in Constitutional Law\n" +
                "\n"
                ,4,"Knowledgeable Legal Advisor specializing in real estate transactions and property law.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.male_five,"Vishal Gupta","556 Blissful Boulevard,\n" +
                "Vadodara, Gujarat 390001\n" +
                "\n","Legal Studies Certificate with a specialization in Cybersecurity Law"
                ,4,"Versatile Corporate Counsel with a proven ability to navigate complex legal issues.\n" +
                "\n"


        ));
        items.add(new Item(R.drawable.female_two,"Riya Gupta","899 Zenith Street,\n" +
                "Hyderabad, Telangana 500001\n","Master of Laws (LLM) in Tax Law\n" +
                "\n"
                ,4,"Seasoned Legal Consultant with a strong background in international business law.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.female_seven,"Aditi Sharma","2444 Blissful Boulevard,\n" +
                "Dhanbad, Jharkhand 826001\n","Legal Studies Certificate in Real Estate Law"
                ,4,"Dedicated Legal Counsel experienced in advising on compliance issues and regulatory matters." +
                ""
        ));
        items.add(new Item(R.drawable.female_five,"Anjali Tiwari","2999 Peaceful Lane,\n" +
                "Srinagar, Jammu and Kashmir 190001\n" +
                "\n","Juris Doctor (JD) with a focus on Technology Law\n" +
                "\n"
                ,4,"Results-driven Legal Advocate adept at representing clients in negotiations and court proceedings.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.male_four,"Arush Gupta","111 Blissful Boulevard,\n" +
                "Pune, Maharashtra 411001\n" +
                "\n","Legal Studies Certificate with a specialization in Cybersecurity Law"
                ,4,"Seasoned Legal Consultant with a strong background in international business law.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.male_three,"Armaan Mehra","1777 Tranquil Terrace,\n" +
                "Coimbatore, Tamil Nadu 641001\n" +
                "\n","Master of Laws (LLM) in Constitutional Law\n" +
                "\n"
                ,4,"Strategic In-House Counsel adept at managing legal affairs for diverse organizations.\n" +
                "\n"
        ));

        items.add(new Item(R.drawable.male_six,"Varun Gupta","2999 Peaceful Lane,\n" +
                "Srinagar, Jammu and Kashmir 190001\n" +
                "\n","Juris Doctor (JD) with a focus on Technology Law\n" +
                "\n"
                ,4,"Accomplished Legal Specialist known for providing clear and practical legal advice.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.feamle_six,"Aditi Mehra","1666 Serendipity Circle,\n" +
                "Ranchi, Jharkhand 834001\n","Master of Laws (LLM) in Cyber Law"
                ,4,"Versatile Corporate Counsel with a proven ability to navigate complex legal issues.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.male_seven,"Aryan Malhotra","590 Blissful Boulevard,\n" +
                "Pune, Maharashtra 411001\n"
                ,"Bachelor of Arts in Law (BAL) with a concentration in Intellectual Property Law\n" +
                "\n",4,"Accomplished In-House Counsel known for providing sound legal guidance on business operations.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.female_seven,"Priti Gpta","890 Zenith Street,\n" +
                "Hyderabad, Telangana 500"
                ,"Master of Laws (LLM) in Tax Law",4,"Knowledgeable Legal Advisor specializing in real estate transactions and property law.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.male_ten,"Aryan Malhotra","444 Harmony Avenue,\n" +
                "Lucknow, Uttar Pradesh 226"
                ,"Juris Doctor (JD) with a focus on Technology Law\n" +
                "\n",4,"Proactive Legal Advocate with expertise in commercial litigation and arbitration"
        ));
        items.add(new Item(R.drawable.female_ten,"Aditi Sharma","223 Sunshine Avenue,\n" +
                "Ludhiana, Punjab 141001\n"
                ,"Master of Laws (LLM) in Constitutional Law\n" +
                "\n",4,"Strategic Legal Officer skilled in labor law, ensuring fair and legal workplace practices.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.male_nine,"Raju Sen","445 Harmony Avenue,\n" +
                "Patna, Bihar 800001\n"
                ,"Legal Studies Certificate in Corporate Governance",4,"Dedicated Legal Counsel experienced in advising on compliance issues and regulatory matters."
        ));
        items.add(new Item(R.drawable.female_nine,"Aditi Reddy","3000 Serenity Road,\n" +
                "Kollam, Kerala 691001\n"
                ,"Juris Doctor (JD) in Immigration and Nationality Law\n" +
                "\n",4,"Results-driven Legal Advocate adept at representing clients in negotiations and court proceedings.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.male_eight,"Vivaan Singh Choudhary","113 Sunshine Avenue,\n" +
                "Ludhiana, Punjab 141001\n"
                ,"Juris Doctor (JD) with a focus on Technology Law\n" +
                "\n",4,"Accomplished In-House Counsel known for providing sound legal guidance on business operations.\n" +
                "\n"
        ));
        items.add(new Item(R.drawable.female_eight,"Sakshi Yadav","444 Harmony Avenue,\n" +
                "Lucknow, Uttar Pradesh 226"
                ,"Master of Laws (LLM) in Tax Law\n" +
                "\n",4,"Strategic Legal Analyst with a focus on mitigating legal risks for organizations."
        ));
        items.add(new Item(R.drawable.male_seven,"Varun Gupta","2111 Serenity Road,\n" +
                "Madurai, Tamil Nadu 625001\n"
                ,"Master of Laws (LLM) in Cyber Law",4,"Versatile Corporate Attorney skilled in advising on labor and employment issues."
        ));
        items.add(new Item(R.drawable.female_seven,"Tanvi Kapoor","1777 Tranquil Terrace,\n" +
                "Coimbatore, Tamil Nadu 641001\n"
                ,"Legal Studies Certificate with a specialization in Cybersecurity Law",4,"Results-driven Legal Advisor with a proven ability to navigate complex legal landscapes."
        ));
        items.add(new Item(R.drawable.male_six,"Varun Gupta","2999 Peaceful Lane" +
                "Srinagar, Jammu and Kashmir 190001\n" +
                "\n","Master of Laws (LLM) in Constitutional Law\n" +
                "\n"
                ,4,"Accomplished Legal Specialist known for providing clear and practical legal advice.\n" +
                "\n"
        ));

    }
}