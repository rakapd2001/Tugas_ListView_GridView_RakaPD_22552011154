package com.example.tugas_listview_gridview_rakapd_22552011154;

public class Item {
    private String title;
    private String subtitle;
    private String imageUrl;

    public Item(String title, String subtitle, String imageUrl) {
        this.title = title;
        this.subtitle = subtitle;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
