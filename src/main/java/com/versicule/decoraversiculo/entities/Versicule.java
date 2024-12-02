package com.versicule.decoraversiculo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Versicule {
    //atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String text;
    private String book;
    private Long chapter;
    private Long verse;
    private String testament;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getBook() {
        return book;
    }
    public void setBook(String book) {
        this.book = book;
    }
    public long getChapter() {
        return chapter;
    }
    public void setChapter(long chapter) {
        this.chapter = chapter;
    }
    public long getVerse() {
        return verse;
    }
    public void setVerse(long verse) {
        this.verse = verse;
    }
    public String getTestament() {
        return testament;
    }
    public void setTestament(String testament) {
        this.testament = testament;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Versicule other = (Versicule) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
