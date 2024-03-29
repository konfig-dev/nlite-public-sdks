/*
 * nlite API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.HotelsData200ResponseDataInner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * HotelsData200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-10T16:56:49.845+01:00[Africa/Casablanca]")
public class HotelsData200Response {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<HotelsData200ResponseDataInner> data = null;

  public HotelsData200Response() {
  }

  public HotelsData200Response data(List<HotelsData200ResponseDataInner> data) {
    
    this.data = data;
    return this;
  }

  public HotelsData200Response addDataItem(HotelsData200ResponseDataInner dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"address\":\"4, rue Petit\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":499641,\"is_closed\":false,\"location\":{\"latitude\":48.88459,\"longitude\":2.37931},\"name\":\"ibis Styles Paris Buttes Chaumont\",\"zip\":\"75019\"},{\"address\":\"4 rue sibour\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":1860519,\"is_closed\":false,\"location\":{\"latitude\":48.87505,\"longitude\":2.35829},\"name\":\"Ibis Styles Paris Gare de l'Est Magenta\",\"zip\":\"75010\"},{\"address\":\"22 rue Barrault\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":1915717,\"is_closed\":false,\"location\":{\"latitude\":48.82839,\"longitude\":2.34734},\"name\":\"Ibis Styles Paris Place d'Italie - Butte Aux Cailles\",\"zip\":\"75013\"},{\"address\":\"11 Bis rue Pierre Semard\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":282726,\"is_closed\":false,\"location\":{\"latitude\":48.87825,\"longitude\":2.34754},\"name\":\"ibis Styles Paris Cadet Lafayette\",\"zip\":\"75009\"},{\"address\":\"32 rue des Plantes\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":281749,\"is_closed\":false,\"location\":{\"latitude\":48.83037,\"longitude\":2.32354},\"name\":\"ibis Styles Paris Alesia Montparnasse\",\"zip\":\"75014\"},{\"address\":\"77 rue du Ruisseau\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":279676,\"is_closed\":false,\"location\":{\"latitude\":48.89527,\"longitude\":2.34092},\"name\":\"ibis Styles Paris Montmartre Nord\",\"zip\":\"75018\"},{\"address\":\"12 avenue De La Porte D Italie\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":4512461,\"is_closed\":false,\"location\":{\"latitude\":48.81701,\"longitude\":2.3594},\"name\":\"ibis Styles Paris Meteor Avenue d'Italie\",\"zip\":\"75013\"},{\"address\":\"21 Rue De Tolbiac\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":256447,\"is_closed\":false,\"location\":{\"latitude\":48.82899,\"longitude\":2.37405},\"name\":\"ibis Styles Paris Tolbiac Bibliotheque\",\"zip\":\"75013\"},{\"address\":\"122, rue la Fayette\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":545435,\"is_closed\":false,\"location\":{\"latitude\":48.87812,\"longitude\":2.35259},\"name\":\"ibis Paris Gare du Nord La Fayette\",\"zip\":\"75010\"},{\"address\":\"105 rue Brancion\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":547981,\"is_closed\":false,\"location\":{\"latitude\":48.83032,\"longitude\":2.30195},\"name\":\"ibis Paris Brancion Parc des Expositions 15ème\",\"zip\":\"75015\"},{\"address\":\"2, avenue du Professeur André Lemierre\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":590250,\"is_closed\":false,\"location\":{\"latitude\":48.85458,\"longitude\":2.41543},\"name\":\"ibis Paris Porte de Montreuil\",\"zip\":\"75020\"},{\"address\":\"80, Rue de la Folie Regnault\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":581667,\"is_closed\":false,\"location\":{\"latitude\":48.86201,\"longitude\":2.38544},\"name\":\"ibis Paris Père Lachaise\",\"zip\":\"75011\"},{\"address\":\"5 rue Caulaincourt\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":543748,\"is_closed\":false,\"location\":{\"latitude\":48.88531,\"longitude\":2.33039},\"name\":\"ibis Paris Montmartre 18ème\",\"zip\":\"75018\"},{\"address\":\"19 Place Des Vins De France\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":545429,\"is_closed\":false,\"location\":{\"latitude\":48.83247,\"longitude\":2.38678},\"name\":\"ibis Paris Bercy Village\",\"zip\":\"75012\"},{\"address\":\"31 bis boulevard Diderot\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":547996,\"is_closed\":false,\"location\":{\"latitude\":48.84613,\"longitude\":2.37601},\"name\":\"ibis Paris Gare de Lyon Diderot\",\"zip\":\"75012\"},{\"address\":\"5 Rue Eugene Gibez\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":547997,\"is_closed\":false,\"location\":{\"latitude\":48.83587,\"longitude\":2.29494},\"name\":\"ibis Paris Vaugirard Porte de Versailles\",\"zip\":\"75015\"},{\"address\":\"15-21 Boulevard Romain Rolland\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":542011,\"is_closed\":false,\"location\":{\"latitude\":48.81952,\"longitude\":2.32655},\"name\":\"ibis budget Porte D'Orleans\",\"zip\":\"75014\"},{\"address\":\"41-43 avenue Ledru Rollin\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":547982,\"is_closed\":false,\"location\":{\"latitude\":48.84785,\"longitude\":2.37097},\"name\":\"ibis Paris Gare de Lyon Ledru Rollin\",\"zip\":\"75012\"},{\"address\":\"111 boulevard Poniatowski\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":555471,\"is_closed\":false,\"location\":{\"latitude\":48.83506,\"longitude\":2.40547},\"name\":\"ibis Daumesnil Porte Doree\",\"zip\":\"75012\"},{\"address\":\"2, avenue Leon Gaumont\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":569257,\"is_closed\":false,\"location\":{\"latitude\":48.8494,\"longitude\":2.41623},\"name\":\"ibis budget Paris Porte de Vincennes\",\"zip\":\"75020\"},{\"address\":\"10 rue Bernard Buffet\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":547992,\"is_closed\":false,\"location\":{\"latitude\":48.89182,\"longitude\":2.31548},\"name\":\"ibis Paris 17 Clichy-Batignolles (ex Berthier)\",\"zip\":\"75017\"},{\"address\":\"49 rue des Plantes\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":545408,\"is_closed\":false,\"location\":{\"latitude\":48.8275,\"longitude\":2.32104},\"name\":\"ibis Paris Alesia Montparnasse\",\"zip\":\"75014\"},{\"address\":\"25 Avenue Stephen Pichon\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":547967,\"is_closed\":false,\"location\":{\"latitude\":48.83271,\"longitude\":2.3591},\"name\":\"ibis Paris Place d’Italie 13ème\",\"zip\":\"75013\"},{\"address\":\"160 Rue du Chateau\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":544580,\"is_closed\":false,\"location\":{\"latitude\":48.83381,\"longitude\":2.32292},\"name\":\"ibis Maine Montparnasse\",\"zip\":\"75014\"},{\"address\":\"15 rue Bréguet \",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":545445,\"is_closed\":false,\"location\":{\"latitude\":48.85737,\"longitude\":2.37288},\"name\":\"ibis Paris Bastille Opera\",\"zip\":\"75011\"},{\"address\":\"31-35 Quai de l'Oise\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":545413,\"is_closed\":false,\"location\":{\"latitude\":48.89201,\"longitude\":2.38492},\"name\":\"ibis Paris La Villette Cité des Sciences\",\"zip\":\"75019\"},{\"address\":\"38 rue du Faubourg Montmartre\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":555444,\"is_closed\":false,\"location\":{\"latitude\":48.87422,\"longitude\":2.34217},\"name\":\"ibis Paris Grands Boulevards Opéra 9e\",\"zip\":\"75009\"},{\"address\":\"197-199, rue Lafayette\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":547974,\"is_closed\":false,\"location\":{\"latitude\":48.88089,\"longitude\":2.36264},\"name\":\"ibis Paris Gare du Nord Château Landon 10ème\",\"zip\":\"75010\"},{\"address\":\"6, rue Saint-Laurent\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":547987,\"is_closed\":false,\"location\":{\"latitude\":48.87551,\"longitude\":2.35848},\"name\":\"ibis Paris Gare De L'Est TGV\",\"zip\":\"75010\"},{\"address\":\"2 Rue Cambronne\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":569933,\"is_closed\":false,\"location\":{\"latitude\":48.847,\"longitude\":2.30141},\"name\":\"Ibis Paris Tour Eiffel Cambronne 15ème\",\"zip\":\"75015\"},{\"address\":\"219 Rue De Crimee\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":217485,\"is_closed\":false,\"location\":{\"latitude\":48.8925,\"longitude\":2.37458},\"name\":\"Ibis Styles Paris Crimée La Villette\",\"zip\":\"75019\"},{\"address\":\"192, Rue De La Croix Nivert\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":217077,\"is_closed\":false,\"location\":{\"latitude\":48.83879,\"longitude\":2.28945},\"name\":\"ibis Styles Paris 15 Lecourbe\",\"zip\":\"75015\"},{\"address\":\"45 rue du Docteur Babinski\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":183024,\"is_closed\":false,\"location\":{\"latitude\":48.90111,\"longitude\":2.33411},\"name\":\"ibis budget Paris Porte De Montmartre\",\"zip\":\"75018\"},{\"address\":\"52 avenue Ledru Rollin\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":1356829,\"is_closed\":false,\"location\":{\"latitude\":48.84802,\"longitude\":2.37184},\"name\":\"Ibis Styles Hotel Paris Gare de Lyon Bastille\",\"zip\":\"75012\"},{\"address\":\"71 Boulevard De Vaugirard\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":656957,\"is_closed\":false,\"location\":{\"latitude\":48.842,\"longitude\":2.32039},\"name\":\"Ibis Paris Gare Montparnasse 15ème\",\"zip\":\"75015\"},{\"address\":\"14 Rue Rampon \",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":657033,\"is_closed\":false,\"location\":{\"latitude\":48.86636,\"longitude\":2.36795},\"name\":\"ibis Paris Avenue de la Republique\",\"zip\":\"75011\"},{\"address\":\"12 Rue Louis Blanc\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":657062,\"is_closed\":false,\"location\":{\"latitude\":48.87943,\"longitude\":2.36829},\"name\":\"ibis Paris Canal Saint Martin\",\"zip\":\"75010\"},{\"address\":\"57 - 63 Avenue Jean Jaures 19 Arr. \",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":657072,\"is_closed\":false,\"location\":{\"latitude\":48.88466,\"longitude\":2.3767},\"name\":\"ibis Budget Paris La Villette 19ème\",\"zip\":\"75019\"},{\"address\":\"5 Rue Saint Laurent \",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":659084,\"is_closed\":false,\"location\":{\"latitude\":48.87541,\"longitude\":2.35848},\"name\":\"ibis Paris Gare De L Est 10ème\",\"zip\":\"75010\"},{\"address\":\"3, Rue Frochot\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":51081,\"is_closed\":false,\"location\":{\"latitude\":48.88126,\"longitude\":2.33754},\"name\":\"Ibis Styles Paris Pigalle Montmartre\",\"zip\":\"75009\"},{\"address\":\"82-84 rue Regnault\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":50669,\"is_closed\":false,\"location\":{\"latitude\":48.82353,\"longitude\":2.37159},\"name\":\"Ibis Styles Paris Massena Olympiades\",\"zip\":\"75013\"},{\"address\":\"96 Cours De Vincennes\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":53211,\"is_closed\":false,\"location\":{\"latitude\":48.84695,\"longitude\":2.40798},\"name\":\"ibis Styles Paris Nation Cours de Vincennes\",\"zip\":\"75012\"},{\"address\":\"9, Rue de Constantinople\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":50725,\"is_closed\":false,\"location\":{\"latitude\":48.87971,\"longitude\":2.32093},\"name\":\"Ibis Styles Paris Gare Saint Lazare\",\"zip\":\"75008\"},{\"address\":\"166 Boulevard de Grenelle\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":50833,\"is_closed\":false,\"location\":{\"latitude\":48.84801,\"longitude\":2.30061},\"name\":\"ibis Styles Paris Eiffel Cambronne\",\"zip\":\"75015\"},{\"address\":\"36, rue de la Croix St Simon\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":53546,\"is_closed\":false,\"location\":{\"latitude\":48.85514,\"longitude\":2.40953},\"name\":\"ibis Styles Paris Nation Porte De Montreuil\",\"zip\":\"75020\"},{\"address\":\"9 Rue Leon Jouhaux\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":46030,\"is_closed\":false,\"location\":{\"latitude\":48.86908,\"longitude\":2.36416},\"name\":\"ibis Styles Paris République\",\"zip\":\"75010\"},{\"address\":\"87 Bd de Strasbourg\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":45937,\"is_closed\":false,\"location\":{\"latitude\":48.87586,\"longitude\":2.35756},\"name\":\"ibis Styles Paris Gare de l'Est TGV\",\"zip\":\"75010\"},{\"address\":\"3/5 rue de Trevise\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":46016,\"is_closed\":false,\"location\":{\"latitude\":48.87276,\"longitude\":2.34499},\"name\":\"ibis Styles Paris Opera Lafayette\",\"zip\":\"75009\"},{\"address\":\"15, Bis Avenue d'Italie\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":45710,\"is_closed\":false,\"location\":{\"latitude\":48.82926,\"longitude\":2.35668},\"name\":\"ibis Paris Avenue d'Italie 13ème\",\"zip\":\"75013\"},{\"address\":\"11 rue de Dunkerque\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":341808,\"is_closed\":false,\"location\":{\"latitude\":48.87953,\"longitude\":2.35661},\"name\":\"ibis Styles Paris Gare du Nord TGV\",\"zip\":\"75010\"},{\"address\":\"13 Rue Trousseau\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":239025,\"is_closed\":false,\"location\":{\"latitude\":48.85173,\"longitude\":2.37873},\"name\":\"ibis Paris Bastille Faubourg St Antoine\",\"zip\":\"75011\"},{\"address\":\"177 Rue De Tolbiac\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":223116,\"is_closed\":false,\"location\":{\"latitude\":48.82582,\"longitude\":2.35263},\"name\":\"ibis Paris Italie Tolbiac\",\"zip\":\"75013\"},{\"address\":\"70 Bis, Boulevard Ornano\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":226779,\"is_closed\":false,\"location\":{\"latitude\":48.89662,\"longitude\":2.34568},\"name\":\"ibis Paris Ornano Montmartre Nord 18ème\",\"zip\":\"75018\"},{\"address\":\"31-33 Rue De Saint-Quentin\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":221017,\"is_closed\":false,\"location\":{\"latitude\":48.87923,\"longitude\":2.35567},\"name\":\"ibis Paris Gare du Nord TGV\",\"zip\":\"75010\"},{\"address\":\"22 Avenue du Maine\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":718236,\"is_closed\":false,\"location\":{\"latitude\":48.84343,\"longitude\":2.32026},\"name\":\"ibis Paris Tour Montparnasse 15eme\",\"zip\":\"75015\"},{\"address\":\"19 Avenue Ferdinand Buisson\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":2279193,\"is_closed\":false,\"location\":{\"latitude\":48.83655,\"longitude\":2.25354},\"name\":\"ibis Styles Paris 16 Boulogne\",\"zip\":\"75016\"},{\"address\":\"28 Bis Bd Diderot\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":54587,\"is_closed\":false,\"location\":{\"latitude\":48.8462,\"longitude\":2.37589},\"name\":\"ibis Styles Paris Gare De Lyon TGV\",\"zip\":\"75012\"},{\"address\":\"1-3 Rue Du Château Landon\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":54087,\"is_closed\":false,\"location\":{\"latitude\":48.87917,\"longitude\":2.36216},\"name\":\"ibis Styles Paris Gare de l'Est Château Landon\",\"zip\":\"75010\"},{\"address\":\"77 Rue De Bercy\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":53690,\"is_closed\":false,\"location\":{\"latitude\":48.83842,\"longitude\":2.38109},\"name\":\"ibis Styles Paris Bercy\",\"zip\":\"75012\"},{\"address\":\"19 Rue Buffault\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":54912,\"is_closed\":false,\"location\":{\"latitude\":48.87597,\"longitude\":2.34213},\"name\":\"ibis Paris Opera La Fayette\",\"zip\":\"75009\"},{\"address\":\"9 Rue de Reuilly\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":53931,\"is_closed\":false,\"location\":{\"latitude\":48.84938,\"longitude\":2.38531},\"name\":\"ibis Paris Gare de Lyon Reuilly\",\"zip\":\"75012\"},{\"address\":\"22, rue Hippolyte Maindron\",\"city\":\"Paris\",\"country\":\"fr\",\"creditcard_required\":false,\"currency\":\"EUR\",\"hotel_description\":\"\",\"hotel_important_information\":\"\",\"id\":368528,\"is_closed\":false,\"location\":{\"latitude\":48.83166,\"longitude\":2.32178},\"name\":\"ibis Styles Paris Maine Montparnasse\",\"zip\":\"75014\"}]", value = "")

  public List<HotelsData200ResponseDataInner> getData() {
    return data;
  }


  public void setData(List<HotelsData200ResponseDataInner> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelsData200Response hotelsData200Response = (HotelsData200Response) o;
    return Objects.equals(this.data, hotelsData200Response.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelsData200Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HotelsData200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HotelsData200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HotelsData200Response is not found in the empty JSON string", HotelsData200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HotelsData200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HotelsData200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            HotelsData200ResponseDataInner.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HotelsData200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HotelsData200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HotelsData200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HotelsData200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<HotelsData200Response>() {
           @Override
           public void write(JsonWriter out, HotelsData200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HotelsData200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HotelsData200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HotelsData200Response
  * @throws IOException if the JSON string is invalid with respect to HotelsData200Response
  */
  public static HotelsData200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HotelsData200Response.class);
  }

 /**
  * Convert an instance of HotelsData200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

