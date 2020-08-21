package com.laioffer.tinnews.ui.save;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.laioffer.tinnews.model.Article;
import com.laioffer.tinnews.repository.NewsRepository;

import java.util.List;

public class SaveViewModel extends ViewModel {

    private final NewsRepository repository;

    public SaveViewModel(NewsRepository repository) {
        this.repository = repository;
    }

    // gets all saved articles in the Room, input来自 search页面上的favorite function
    // any updates in the Article table will immediately trigger new returns
    public LiveData<List<Article>> getAllSavedArticles() {
        return repository.getAllSavedArticles();
    }

    // remove the Article from the database.
    public void deleteSavedArticle(Article article) {
        repository.deleteSavedArticle(article);
    }

    public void onCancel() {
        repository.onCancel();
    }
}

