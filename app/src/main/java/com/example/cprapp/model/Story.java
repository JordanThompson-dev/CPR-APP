package com.example.cprapp.model;

import com.example.cprapp.R;

public class Story {
    private Page[] pages;
    public Story() {
        pages = new Page[30];
        pages[0] = new Page(R.drawable.page0,R.string.page0,new Choice(R.string.page0_choice1,1),
                new Choice(R.string.page0_choice2,0));

        pages[1] = new Page(R.drawable.page1,R.string.page1,new Choice(R.string.page0_choice1,2),
                new Choice(R.string.page0_choice2,0));
        pages[2] = new Page(R.drawable.page2,R.string.page2,new Choice(R.string.pageAllChoice_1,3),
                new Choice(R.string.pageAllChoice_2,8));
        pages[3] = new Page(R.drawable.page3,R.string.page3,new Choice(R.string.page0_choice1,4),
                new Choice(R.string.page0_choice2,2));
        pages[4] = new Page(R.drawable.page4,R.string.page4,new Choice(R.string.page0_choice1,5),
                new Choice(R.string.page0_choice2,3));
        pages[5] = new Page(R.drawable.page5,R.string.page5,new Choice(R.string.pageAllChoice_1,6),
                new Choice(R.string.pageAllChoice_2,8));
        pages[6] = new Page(R.drawable.page6,R.string.page6,new Choice(R.string.page0_choice1,7),
                new Choice(R.string.page0_choice2,5));
        pages[7] = new Page(R.drawable.page7,R.string.page7,new Choice(R.string.page0_choice1,8),
                new Choice(R.string.page0_choice2,6));
        pages[8] = new Page(R.drawable.page8,R.string.page8,new Choice(R.string.page0_choice1,9),
                new Choice(R.string.page0_choice2,7));
        pages[9] = new Page(R.drawable.page9,R.string.page9,new Choice(R.string.pageAllChoice_1,10),
                new Choice(R.string.pageAllChoice_2,14));

        pages[10] = new Page(R.drawable.page9,R.string.page10,new Choice(R.string.page0_choice1,11),
                new Choice(R.string.page0_choice2,9));
        pages[11] = new Page(R.drawable.page10,R.string.page11,new Choice(R.string.page0_choice1,12),
                new Choice(R.string.page0_choice2,10));
        pages[12] = new Page(R.drawable.page11,R.string.page12,new Choice(R.string.pageAllChoice_1,13),
                new Choice(R.string.pageAllChoice_2,14));

        pages[13] = new Page(R.drawable.page13,R.string.page13,new Choice(R.string.page0_choice1,29),
                new Choice(R.string.page0_choice2,12));
        pages[14] = new Page(R.drawable.page15,R.string.page14,new Choice(R.string.page0_choice1,15),
                new Choice(R.string.page0_choice2,13));
        pages[15] = new Page(R.drawable.page11,R.string.page15,new Choice(R.string.pageAllChoice_1,21),
                new Choice(R.string.pageAllChoice_2,16));
        pages[16] = new Page(R.drawable.page10,R.string.page16,new Choice(R.string.page0_choice1,17),
                new Choice(R.string.page0_choice2,15));
        pages[17] = new Page(R.drawable.page11,R.string.page17,new Choice(R.string.pageAllChoice_1,21),
                new Choice(R.string.pageAllChoice_2,18));
        pages[18] = new Page(R.drawable.page14,R.string.page18,new Choice(R.string.page0_choice1,19),
                new Choice(R.string.page0_choice2,17));
        pages[19] = new Page(R.drawable.page11,R.string.page19,new Choice(R.string.pageAllChoice_1,21),
                new Choice(R.string.pageAllChoice_2,20));
        pages[20] = new Page(R.drawable.page14,R.string.page20,new Choice(R.string.page0_choice1,28),
                new Choice(R.string.page0_choice2,19));
        pages[21] = new Page(R.drawable.page15,R.string.page21,new Choice(R.string.page0_choice1,22),
                new Choice(R.string.page0_choice2,20));
        pages[22] = new Page(R.drawable.page22,R.string.page22,new Choice(R.string.page0_choice1,23),
                new Choice(R.string.page0_choice2,21));
        pages[23] = new Page(R.drawable.page22,R.string.page23,new Choice(R.string.pageAllChoice_1,24),
                new Choice(R.string.pageAllChoice_2,26));
        pages[24] = new Page(R.drawable.page15,R.string.page24,new Choice(R.string.page0_choice1,25),
                new Choice(R.string.page0_choice2,23));
        pages[25] = new Page(R.drawable.page22,R.string.page25,new Choice(R.string.pageAllChoice_1,28),
                new Choice(R.string.pageAllChoice_2,26));
        pages[26] = new Page(R.drawable.page24,R.string.page26,new Choice(R.string.page0_choice1,27),
                new Choice(R.string.page0_choice2,25));
        pages[27] = new Page(R.drawable.page22,R.string.page27,new Choice(R.string.page0_choice1,28),
                new Choice(R.string.page0_choice2,26));
        pages[28] = new Page(R.drawable.page13,R.string.page28,new Choice(R.string.page0_choice1,29),
                new Choice(R.string.page0_choice2,27));
        pages[29] = new Page(R.drawable.ic_logo,R.string.page29,new Choice(R.string.page29_choice1,0),
                new Choice(R.string.page0_choice2,28));










    }

    public Page getPage(int pageNumber) {
        if (pageNumber >= pages.length) {
            pageNumber=0;

        }
        return pages[pageNumber];
    }
}
