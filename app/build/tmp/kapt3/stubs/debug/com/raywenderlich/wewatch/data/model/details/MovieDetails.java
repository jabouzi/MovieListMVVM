package com.raywenderlich.wewatch.data.model.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010$\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010\u000fR\"\u0010\'\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR \u0010*\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000fR \u0010-\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u000fR \u00100\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\r\"\u0004\b2\u0010\u000fR \u00103\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\r\"\u0004\b5\u0010\u000fR\"\u00106\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010=\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\r\"\u0004\b?\u0010\u000fR&\u0010@\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010!\"\u0004\bC\u0010#R&\u0010D\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010!\"\u0004\bG\u0010#R \u0010H\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\r\"\u0004\bJ\u0010\u000fR\"\u0010K\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bL\u0010\u0019\"\u0004\bM\u0010\u001bR\"\u0010N\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\bO\u0010\u0019\"\u0004\bP\u0010\u001bR&\u0010Q\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010!\"\u0004\bT\u0010#R \u0010U\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\r\"\u0004\bW\u0010\u000fR \u0010X\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\r\"\u0004\bZ\u0010\u000fR \u0010[\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\r\"\u0004\b]\u0010\u000fR\"\u0010^\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b_\u0010\u0006\"\u0004\b`\u0010\bR\"\u0010a\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010<\u001a\u0004\bb\u00109\"\u0004\bc\u0010;R\"\u0010d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\be\u0010\u0019\"\u0004\bf\u0010\u001b\u00a8\u0006g"}, d2 = {"Lcom/raywenderlich/wewatch/data/model/details/MovieDetails;", "", "()V", "adult", "", "getAdult", "()Ljava/lang/Boolean;", "setAdult", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "backdropPath", "", "getBackdropPath", "()Ljava/lang/String;", "setBackdropPath", "(Ljava/lang/String;)V", "belongsToCollection", "Lcom/raywenderlich/wewatch/data/model/details/BelongsToCollection;", "getBelongsToCollection", "()Lcom/raywenderlich/wewatch/data/model/details/BelongsToCollection;", "setBelongsToCollection", "(Lcom/raywenderlich/wewatch/data/model/details/BelongsToCollection;)V", "budget", "", "getBudget", "()Ljava/lang/Integer;", "setBudget", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "genres", "", "Lcom/raywenderlich/wewatch/data/model/details/Genre;", "getGenres", "()Ljava/util/List;", "setGenres", "(Ljava/util/List;)V", "homepage", "getHomepage", "setHomepage", "id", "getId", "setId", "imdbId", "getImdbId", "setImdbId", "originalLanguage", "getOriginalLanguage", "setOriginalLanguage", "originalTitle", "getOriginalTitle", "setOriginalTitle", "overview", "getOverview", "setOverview", "popularity", "", "getPopularity", "()Ljava/lang/Double;", "setPopularity", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "posterPath", "getPosterPath", "setPosterPath", "productionCompanies", "Lcom/raywenderlich/wewatch/data/model/details/ProductionCompany;", "getProductionCompanies", "setProductionCompanies", "productionCountries", "Lcom/raywenderlich/wewatch/data/model/details/ProductionCountry;", "getProductionCountries", "setProductionCountries", "releaseDate", "getReleaseDate", "setReleaseDate", "revenue", "getRevenue", "setRevenue", "runtime", "getRuntime", "setRuntime", "spokenLanguages", "Lcom/raywenderlich/wewatch/data/model/details/SpokenLanguage;", "getSpokenLanguages", "setSpokenLanguages", "status", "getStatus", "setStatus", "tagline", "getTagline", "setTagline", "title", "getTitle", "setTitle", "video", "getVideo", "setVideo", "voteAverage", "getVoteAverage", "setVoteAverage", "voteCount", "getVoteCount", "setVoteCount", "app_debug"})
public final class MovieDetails {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "adult")
    private java.lang.Boolean adult;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "backdrop_path")
    private java.lang.String backdropPath;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "belongs_to_collection")
    private com.raywenderlich.wewatch.data.model.details.BelongsToCollection belongsToCollection;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "budget")
    private java.lang.Integer budget;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "genres")
    private java.util.List<com.raywenderlich.wewatch.data.model.details.Genre> genres;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "homepage")
    private java.lang.String homepage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "imdb_id")
    private java.lang.String imdbId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "original_language")
    private java.lang.String originalLanguage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "original_title")
    private java.lang.String originalTitle;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "overview")
    private java.lang.String overview;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "popularity")
    private java.lang.Double popularity;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "poster_path")
    private java.lang.String posterPath;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "production_companies")
    private java.util.List<com.raywenderlich.wewatch.data.model.details.ProductionCompany> productionCompanies;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "production_countries")
    private java.util.List<com.raywenderlich.wewatch.data.model.details.ProductionCountry> productionCountries;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "release_date")
    private java.lang.String releaseDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "revenue")
    private java.lang.Integer revenue;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "runtime")
    private java.lang.Integer runtime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "spoken_languages")
    private java.util.List<com.raywenderlich.wewatch.data.model.details.SpokenLanguage> spokenLanguages;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "tagline")
    private java.lang.String tagline;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "video")
    private java.lang.Boolean video;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    private java.lang.Double voteAverage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "vote_count")
    private java.lang.Integer voteCount;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getAdult() {
        return null;
    }
    
    public final void setAdult(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackdropPath() {
        return null;
    }
    
    public final void setBackdropPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.raywenderlich.wewatch.data.model.details.BelongsToCollection getBelongsToCollection() {
        return null;
    }
    
    public final void setBelongsToCollection(@org.jetbrains.annotations.Nullable()
    com.raywenderlich.wewatch.data.model.details.BelongsToCollection p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBudget() {
        return null;
    }
    
    public final void setBudget(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.raywenderlich.wewatch.data.model.details.Genre> getGenres() {
        return null;
    }
    
    public final void setGenres(@org.jetbrains.annotations.Nullable()
    java.util.List<com.raywenderlich.wewatch.data.model.details.Genre> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHomepage() {
        return null;
    }
    
    public final void setHomepage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImdbId() {
        return null;
    }
    
    public final void setImdbId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalLanguage() {
        return null;
    }
    
    public final void setOriginalLanguage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOriginalTitle() {
        return null;
    }
    
    public final void setOriginalTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final void setOverview(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPopularity() {
        return null;
    }
    
    public final void setPopularity(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    public final void setPosterPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.raywenderlich.wewatch.data.model.details.ProductionCompany> getProductionCompanies() {
        return null;
    }
    
    public final void setProductionCompanies(@org.jetbrains.annotations.Nullable()
    java.util.List<com.raywenderlich.wewatch.data.model.details.ProductionCompany> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.raywenderlich.wewatch.data.model.details.ProductionCountry> getProductionCountries() {
        return null;
    }
    
    public final void setProductionCountries(@org.jetbrains.annotations.Nullable()
    java.util.List<com.raywenderlich.wewatch.data.model.details.ProductionCountry> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    public final void setReleaseDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRevenue() {
        return null;
    }
    
    public final void setRevenue(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRuntime() {
        return null;
    }
    
    public final void setRuntime(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.raywenderlich.wewatch.data.model.details.SpokenLanguage> getSpokenLanguages() {
        return null;
    }
    
    public final void setSpokenLanguages(@org.jetbrains.annotations.Nullable()
    java.util.List<com.raywenderlich.wewatch.data.model.details.SpokenLanguage> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTagline() {
        return null;
    }
    
    public final void setTagline(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getVideo() {
        return null;
    }
    
    public final void setVideo(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getVoteAverage() {
        return null;
    }
    
    public final void setVoteAverage(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVoteCount() {
        return null;
    }
    
    public final void setVoteCount(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public MovieDetails() {
        super();
    }
}