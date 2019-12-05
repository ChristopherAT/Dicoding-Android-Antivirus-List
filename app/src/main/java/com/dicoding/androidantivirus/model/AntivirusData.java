package com.dicoding.androidantivirus.model;

import com.dicoding.androidantivirus.R;

import java.util.ArrayList;

public class AntivirusData {
    private static String[] avNames = {
            "AhnLab Mobile Security",
            "Avast Mobile Security",
            "AVG AntiVirus FREE for Android",
            "Avira Free Android Security",
            "Bitdefender Mobile Security",
            "Cheetah Mobile Security Master",
            "Comodo Mobile Security",
            "Dr. Web Mobile Security Suite",
            "Kaspersky Mobile Security",
            "McAfee Mobile Security",
            "Sourcefire FireAMP Mobile",
            "Symantec Norton Mobile Security"
    };

    private static String[] avYear = {
            "2010",
            "2011",
            "2010",
            "2004",
            "2011",
            "2012",
            "2012",
            "2010",
            "2011",
            "2011",
            "2012",
            "2011"};
    private static String[] avCountry = {
            "South Korea",
            "Czech Republic",
            "Czech Republic",
            "Germany",
            "Romania",
            "China",
            "United States",
            "Russia",
            "Russia",
            "United States",
            "United States",
            "United States"};
    private static String[] avPrice = {
            "-",
            "Free",
            "Free",
            "Free",
            "Freemium",
            "Free",
            "Free",
            "Trialware",
            "Non-free",
            "Non-free",
            "-",
            "Non-free"
    };

    private static String[] avDetails = {
            "AhnLab, Inc., founded in 1995, is a security software provider in South Korea. AhnLab sells computer software such as antivirus software, online security, network security appliances such as Advanced Threat (Malware) Detection & Remediation, including APT type of cyber attack, firewalls, IPS, UTM, and security software for online games and the mobile web.",
            "Avast Antivirus is a family of internet security applications developed by Avast for Microsoft Windows, macOS, Android and iOS. The Avast Antivirus products include free and proprietary versions that provide computer security, browser security, antivirus software, firewall, anti-phishing, antispyware, and anti-spam among other services. As of 2017, Avast is the most popular antivirus vendor on the market, and it had the largest share of the market for antivirus applications.",
            "AVG AntiVirus (previously known as AVG, an abbreviation of Anti-Virus Guard) is a family of antivirus software developed by AVG Technologies, a subsidiary of Avast. It is available for Windows, macOS and Android.",
            "Avira Operations GmbH & Co. KG is a German multinational computer security software company mainly known for their antivirus software Avira Internet Security. Avira was founded in 2006, but the anti virus application is under active development since 1986 through its predecessor company H+BEDV Datentechnik GmbH. As of 2012, Avira software is estimated to have over 100 million customers. In June 2012, Avira ranked sixth in the antivirus market share report from OPSWAT.",
            "Bitdefender is a Romanian cybersecurity and anti-virus software company. It was founded in 2001 by Florin Talpeș who is currently the CEO. Bitdefender develops and sells anti-virus software, internet security software, endpoint security software, and other cybersecurity products and services. As of 2018, the software has about 500 million users worldwide.",
            "Cheetah Mobile Inc is a Chinese mobile Internet company headquartered in Beijing, China. Being the creator to some of the most popular global mobile apps, it has more than 634 million monthly active users as of Jan 2017. The company was established in 2010 as a merger of Kingsoft Security and Conew Image, and grew to be the second-largest internet security software provider in China, according to iResearch.",
            "Comodo Mobile Security (CMS) is a mobile application provided free by the Comodo Group that protects Android devices against viruses, worms and scripts. It also features SMS and call blocking, a software and process manager, data and apps backup and data traffic monitor. The anti-theft feature allows users to recover lost or stolen devices. This is the first security app from Comodo, specialists in Internet security, for the Android platform.",
            "Dr.Web is a software suite developed by Russian anti-malware company Doctor Web. First released in 1992, it became the first anti-virus service in Russia. The company also offers anti-spam solutions and is used by Yandex to scan e-mail attachments. It also features an add-on for all major browsers which checks links with the online version of Dr Web. Dr.Web has withdrawn from AV tests such as Virus Bulletin VB100% around 2008 stating that they believe that virus scans on viruses are different subject from that of real world malware attacks.",
            "Kaspersky Lab is a multinational cybersecurity and anti-virus provider headquartered in Moscow, Russia and operated by a holding company in the United Kingdom. It was founded in 1997 by Eugene Kaspersky, Natalya Kaspersky, and Alexey De-Monderik; Eugene Kaspersky is currently the CEO. Kaspersky Lab develops and sells antivirus, internet security, password management, endpoint security, and other cybersecurity products and services.",
            "McAfee, LLC (formerly known as McAfee Associates, Inc. in 1987–2014 and Intel Security Group in 2014–2017) is an American global computer security software company headquartered in Santa Clara, California and claims to be the world's largest dedicated security technology company. The company was purchased by Intel in February 2011, and became part of the Intel Security division.",
            "Sourcefire, Inc was a technology company that developed network security hardware and software. The company's Firepower network security appliances are based on Snort, an open-source intrusion detection system (IDS). Sourcefire was acquired by Cisco for $2.7 billion in July 2013.",
            "Symantec Corporation (commonly known as Symantec) is an American software company headquartered in Mountain View, California, United States. The company provides cybersecurity software and services. Symantec is a Fortune 500 company and a member of the S&P 500 stock-market index. The company also has development centers in Pune, Chennai and Bengaluru (India). On October 9, 2014, Symantec declared it would split into two independent publicly traded companies by the end of 2015. One company would focus on security, the other on information management. On January 29, 2016, Symantec sold its information-management subsidiary, named Veritas Technologies (which Symantec had acquired in 2004) to The Carlyle Group."
    };
    private static int[] avImages = {
            R.drawable.av_ahnlab,
            R.drawable.av_avast,
            R.drawable.av_avg,
            R.drawable.av_avira,
            R.drawable.av_bitdefender,
            R.drawable.av_cheetah,
            R.drawable.av_comodo,
            R.drawable.av_drweb,
            R.drawable.av_kaspersky,
            R.drawable.av_mcafee,
            R.drawable.av_sourcefire,
            R.drawable.av_symantec
    };

    public static ArrayList<Antivirus> getListData() {
        ArrayList<Antivirus> list = new ArrayList<>();
        for (int position = 0; position < avNames.length; position++) {
            Antivirus AV = new Antivirus();
            AV.setName(avNames[position]);
            AV.setDetail(avDetails[position]);
            AV.setPhoto(avImages[position]);
            AV.setYear(avYear[position]);
            AV.setCountry(avCountry[position]);
            AV.setPrice(avPrice[position]);
            list.add(AV);
        }
        return list;
    }

}
