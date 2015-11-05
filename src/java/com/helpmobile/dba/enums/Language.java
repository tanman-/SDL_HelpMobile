/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.dba.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import com.helpmobile.dba.enums.LabeledEnum;

/**
 *
 * @author Tanman
 */
public enum Language implements LabeledEnum {

    ABKHAZIAN("Abkhazian"),
    AFAR("Afar"),
    AFRIKAANS("Afrikaans"),
    ALBANIAN("Albanian"),
    AMHARIC("Amharic"),
    ARABIC("Arabic"),
    ARMENIAN("Armenian"),
    ASSAMESE("Assamese"),
    AYMARA("Aymara"),
    AZERBAIJANI("Azerbaijani"),
    BASHKIR("Bashkir"),
    BASQUE("Basque"),
    BELARUSIAN("Belarusian"),
    BENGALI("Bengali"),
    BHUTANI("Bhutani"),
    BIHARI("Bihari"),
    BISLAMA("Bislama"),
    BOSNIAN("Bosnian"),
    BRETON("Breton"),
    BULGARIAN("Bulgarian"),
    BURMESE("Burmese"),
    CATALAN("Catalan"),
    CHINESECANTONESE("Chinese (Cantonese)"),
    CHINESEMANDARIN("Chinese (Mandarin)"),
    CHINESEOTHER("Chinese (Other)"),
    CORSICAN("Corsican"),
    CROATIAN("Croatian"),
    CZECH("Czech"),
    DANISH("Danish"),
    DHIVEHI("Dhivehi"),
    DUTCH("Dutch"),
    ENGLISH("English"),
    ESPERANTO("Esperanto"),
    ESTONIAN("Estonian"),
    FAROESE("Faroese"),
    FARSI("Farsi"),
    FIJI("Fiji"),
    FINNISH("Finnish"),
    FRENCH("French"),
    FRISIAN("Frisian"),
    GALICIAN("Galician"),
    GANDA("Ganda"),
    GEORGIAN("Georgian"),
    GERMAN("German"),
    GREE("Gree"),
    GREENLANDIC("Greenlandic"),
    GUARANI("Guarani"),
    GUJARATI("Gujarati"),
    HAITIANCREOLE("Haitian Creole"),
    HAUSA("Hausa"),
    HEBREW("Hebrew"),
    HINDI("Hindi"),
    HUNGARIAN("Hungarian"),
    ICELANDIC("Icelandic"),
    INDONESIAN("Indonesian"),
    INUKTITUT("Inuktitut"),
    INUPIAK("Inupiak"),
    IRISH("Irish"),
    ITALIAN("Italian"),
    JAPANESE("Japanese"),
    JAVANESE("Javanese"),
    KANNADA("Kannada"),
    KASHMIRI("Kashmiri"),
    KAZAKH("Kazakh"),
    KHMER("Khmer"),
    KINYARWANDA("Kinyarwanda"),
    KIRUNDI("Kirundi"),
    KOREAN("Korean"),
    KURDISH("Kurdish"),
    KYRGYZ("Kyrgyz"),
    LAOTHIAN("Laothian"),
    LATIN("Latin"),
    LATVIAN("Latvian"),
    LINGALA("Lingala"),
    LITHUANIAN("Lithuanian"),
    MACEDONIAN("Macedonian"),
    MALAGASY("Malagasy"),
    MALAY("Malay"),
    MALAYALAM("Malayalam"),
    MALTESE("Maltese"),
    MAORI("Maori"),
    MARATHI("Marathi"),
    MOLDAVIAN("Moldavian"),
    MONGOLIAN("Mongolian"),
    NAURU("Nauru"),
    NEPALI("Nepali"),
    NORWEGIANBOKMAL("Norwegian (Bokmal)"),
    NORWEGIANNYNORSK("Norwegian (Nynorsk)"),
    ORIYA("Oriya"),
    OROMO("Oromo"),
    PASHTOPUSHTO("Pashto/Pushto"),
    POLISH("Polish"),
    PORTUGUESEBRAZIL("Portuguese (Brazil)"),
    PORTUGUESE("Portuguese"),
    PUNJABI("Punjabi"),
    QUECHUA("Quechua"),
    RHAETOROMANCE("Rhaeto-Romance"),
    ROMANIAN("Romanian"),
    RUSSIAN("Russian"),
    SAMOAN("Samoan"),
    SANGHO("Sangho"),
    SANSKRIT("Sanskrit"),
    SCOTSGAELIC("Scots Gaelic"),
    SERBIAN("Serbian"),
    SERBOCROATIAN("Serbo-Croatian"),
    SESOTHO("Sesotho"),
    SETSWANA("Setswana"),
    SHONA("Shona"),
    SINDHI("Sindhi"),
    SINHALESE("Sinhalese"),
    SISWATI("Siswati"),
    SLOVAK("Slovak"),
    SLOVENIAN("Slovenian"),
    SOMALI("Somali"),
    SPANISH("Spanish"),
    SUNDANESE("Sundanese"),
    SWAHILI("Swahili"),
    SWEDISH("Swedish"),
    TAGALOG("Tagalog"),
    TAJIK("Tajik"),
    TAMIL("Tamil"),
    TATAR("Tatar"),
    TELUGU("Telugu"),
    THAI("Thai"),
    TIBETAN("Tibetan"),
    TIGRINYA("Tigrinya"),
    TONGA("Tonga"),
    TSONGA("Tsonga"),
    TURKISH("Turkish"),
    TURKMEN("Turkmen"),
    TWI("Twi"),
    UIGHUR("Uighur"),
    UKRAINIAN("Ukrainian"),
    URDU("Urdu"),
    UZBEK("Uzbek"),
    VIETNAMESE("Vietnamese"),
    VOLAPUK("Volapuk"),
    WELSH("Welsh"),
    WOLOF("Wolof"),
    XHOSA("Xhosa"),
    YIDDISH("Yiddish"),
    ZHUANG("Zhuang"),
    ZULU("Zulu");

    private final String label;

    private Language(String label) {
        this.label = label;
    }

    @JsonValue
    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
    
    @Override
    public String getShort(){
        return label;
    }
}
