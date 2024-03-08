package com.example.presidentlistrecycleview;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApplication extends Application {
    private static List<President> presidentList = new ArrayList<President>();
    private static int nextId = 10;

    public MyApplication() {
        fillPresident();
    }

    private void fillPresident() {
        President p0 = new President(0,"George Washington", 1788, "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg/800px-Gilbert_Stuart_Williamstown_Portrait_of_George_Washington.jpg");
        President p1 = new President(1, "John Adams", 1796, "https://upload.wikimedia.org/wikipedia/commons/thumb/0/07/John_Adams_A18236.jpg/225px-John_Adams_A18236.jpg");
        President p2 = new President(2, "Thomas Jefferson", 1800, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Thomas_Jefferson_by_Rembrandt_Peale%2C_1800.jpg/800px-Thomas_Jefferson_by_Rembrandt_Peale%2C_1800.jpg");
        President p3 = new President(3, "Abraham Lincoln", 1860, "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ab/Abraham_Lincoln_O-77_matte_collodion_print.jpg/800px-Abraham_Lincoln_O-77_matte_collodion_print.jpg");
        President p4 = new President(4, "Ulysses S. Grant", 1868, "https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Ulysses_S_Grant_by_Brady_c1870-restored.jpg/800px-Ulysses_S_Grant_by_Brady_c1870-restored.jpg");
        President p5 = new President(5, "John Quincy Adams", 1824, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4f/John_Quincy_Adams_by_Charles_Osgood.jpg/225px-John_Quincy_Adams_by_Charles_Osgood.jpg");
        President p6 = new President(6, "Andrew Jackson", 1828, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/43/Andrew_jackson_head.jpg/225px-Andrew_jackson_head.jpg");
        President p7 = new President(7, "Martin Van Buren", 1836, "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/Martin_Van_Buren_circa_1837_crop.jpg/225px-Martin_Van_Buren_circa_1837_crop.jpg");
        President p8 = new President(8, "William Henry Harrison", 1840, "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/William_Henry_Harrison_by_James_Reid_Lambdin%2C_1835_crop.jpg/225px-William_Henry_Harrison_by_James_Reid_Lambdin%2C_1835_crop.jpg");
        President p9 = new President(9, "John Tyler", 1900, "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/John_Tyler_crop.jpg/225px-John_Tyler_crop.jpg");

        presidentList.addAll(Arrays.asList(new President[] {p0, p1, p2, p3, p4, p5, p6, p7, p8, p9}));
    }

    public static List<President> getPresidentList() {
        return presidentList;
    }

    public static void setPresidentList(List<President> presidentList) {
        MyApplication.presidentList = presidentList;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        MyApplication.nextId = nextId;
    }
}
