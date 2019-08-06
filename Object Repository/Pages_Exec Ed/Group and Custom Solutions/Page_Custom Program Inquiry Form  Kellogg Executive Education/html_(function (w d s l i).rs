<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_(function (w d s l i)</name>
   <tag></tag>
   <elementGuidId>36c72cdd-1228-4f43-9470-2227dfb210e6</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//html</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value> js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers no-applicationcache no-svg no-inlinesvg no-smil no-svgclippaths</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>lang</name>
      <type>Main</type>
      <value>en</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
     
    
(function (w, d, s, l, i) {
w[l] = w[l] || []; w[l].push({
'gtm.start':
new Date().getTime(), event: 'gtm.js'
}); var f = d.getElementsByTagName(s)[0],
j = d.createElement(s), dl = l != 'dataLayer' ? '&amp;l=' + l : ''; j.async = true; j.src =
'//www.googletagmanager.com/gtm.js?id=' + i + dl; f.parentNode.insertBefore(j, f);
})(window, document, 'script', 'dataLayer', 'GTM-TTC796');


{
	&quot;@context&quot;: &quot;http://schema.org/&quot;,
	&quot;@type&quot;: &quot;CollegeOrUniversity&quot;,
	&quot;address&quot;: {
		&quot;@type&quot;: &quot;PostalAddress&quot;,
		&quot;addressCountry&quot;: &quot;United States&quot;,
		&quot;addressLocality&quot;: &quot;Evanston&quot;,
		&quot;addressRegion&quot;: &quot;IL&quot;,
		&quot;postalCode&quot;: &quot;60208&quot;,
                &quot;streetAddress&quot;: &quot;2169 Campus Drive&quot;,
		&quot;telephone&quot;: &quot;847-467-6018&quot;
	},
	&quot;name&quot;: &quot;Kellogg Executive Education&quot;,
        &quot;url&quot;: &quot;https://www.kellogg.northwestern.edu/executive-education&quot;,
	&quot;parentOrganization&quot;: {
		&quot;@type&quot;: &quot;CollegeOrUniversity&quot;,
		&quot;name&quot;: &quot;Northwestern University&quot;
	}
}


    
    Custom Program Inquiry Form | Kellogg Executive Education
    
    
    
       
    
    
    
	
    
    
    

    

    
    
#katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}


     (function(a,b,c,d){
a='//tags.tiqcdn.com/utag/kellogg/main/prod/utag.js'; b=document;c='script';d=b.createElement(c);d.src=a; d.type='text/java'+c;d.async=true; a=b.getElementsByTagName(c)[0];a.parentNode.insertBefore(d,a)
})();


&lt;iframe src=&quot;//www.googletagmanager.com/ns.html?id=GTM-TTC796&quot;
height=&quot;0&quot; width=&quot;0&quot; style=&quot;display:none;visibility:hidden&quot;>&lt;/iframe>

    
        
    
    

            

    
        
            executive-education
        
        
            
                
                

    
		






	
	
	
		    		
                
                
	Website
	Research
	Faculty


		        
                
            
        
    



    $(document).ready(function () {
        $(&quot;#txtQuery&quot;).bind(&quot;keypress&quot;, {}, keypressInBox);
    });

    function doSearch()
    {
        var value = '';

        var value = $('#ddSources').val();
        
        if (value == null)
        {
            value = $('#hdnSource').val();
        }

        var query = $('#txtQuery').val();
        
        var res = value.split('|');

        var col = res[0];
        var url = res[1];

        url = url.replace(&quot;[query]&quot;, query);
        url = url.replace(&quot;[col]&quot;, col);
       
        window.location.href = url;
        return false;
    }

    function keypressInBox(e) {
        var code = (e.keyCode ? e.keyCode : e.which);
        if (code == 13) {                        
            e.preventDefault();
            doSearch();
        }
    };



                
                
                
                    
                                
                                                                                                                     
                                
                    
                
                
                    
                        Kellogg Executive Education
                    
                
            
        
        

        
            
                
                    Toggle navigation
                
                
                    
                    
                

                
                

                
                    
                        Kellogg Executive Education
                    
                
                
                
                

                
                    
                
            

            
                
                




    
    
        Individual Programs
        
            
            
                            
                                
                                    
                                        
                                            
                                                
                                            
                                           
                                            Executive Scholar Certificate
                                            Earn a credential customized to your professional development goals.
                                            Learn more
                                        
                                    
                                
                            

                    
                            
                                
                                    Executive Programs
                                    
                                              General Management
                                    
                                              Family Enterprise
                                    
                                              Finance &amp; Accounting
                                    
                                              Governance
                                    
                                              Growth &amp; Innovation
                                    
                                              Leadership
                                    
                                              Marketing &amp; Sales
                                    
                                              Operations &amp; Technology
                                    
                                              Strategy
                                    
                                              Women
                                    

                                
                            
                    
                            
                                
                                    Online Programs
                                    C-Suite Programs
                                    Nonprofit Programs
                                    
                                              Upcoming Programs
                                    
                                              Request Catalog
                                    
                                              Contact Nonprofit
                                    

                                
                            
                    
                            
                                
                                    Executive Scholar Certificate
                                    
                                              Request a Brochure
                                    
                                              Apply
                                    

                                
                            
                    
                            
                                
                                    Request A Brochure
                                    Find a Program
                                    Contact us
                                    
                                            
                                                
                                                
Saved Programs 0 

                                            
                                    

                                
                            
                    
        
    
    
    
        Group &amp; Custom Solutions
        
            
            
                            
                                
                                    
                                        
                                            
                                                
                                            
                                           
                                            Explore group and custom solutions
                                            Accelerate your growth: build an outcome-based partnership between Kellogg and your organization.
                                            Learn more
                                        
                                    
                                
                            

                    
                            
                                
                                    Our Partnership Philosophy
                                    Design Process &amp; Team
                                    

                                
                            
                    
                            
                                
                                    Association &amp; Specialty Programs
                                    Academic Partners
                                    

                                
                            
                    
                            
                                
                                    Group Registrations
                                    

                                
                            
                    
                            
                                
                                    Inquiry Form
                                    Contact Us
                                    

                                
                            
                    
        
    
    
    
        The Kellogg Experience
        
            
            
                            
                                
                                    
                                        
                                            
                                                
                                            
                                           
                                            Gain the Kellogg edge
                                            A distinctive cross-disciplinary approach puts the Kellogg advantage to work for you.
                                            Learn more
                                        
                                    
                                
                            

                    
                            
                                
                                    The Kellogg Advantage
                                    Our Learning Environment
                                    FAQs
                                    

                                
                            
                    
                            
                                
                                    Our Faculty
                                    Thought Leadership
                                    

                                
                            
                    
                            
                                
                                    Participant Perspectives
                                    Alumni Benefits
                                    

                                
                            
                    
                            
                                
                                    Request A Brochure
                                    Subscribe to Newsletter
                                    Find a Program
                                    Contact us
                                    
                                            
                                                
                                                
Saved Programs 0 

                                            
                                    

                                
                            
                    
        
    
    




    

    

        
        
            Individual Programs
            Individual Programs
            

                
                                Executive Programs 
                
                                Online Programs 
                
                                C-Suite Programs 
                
                                Nonprofit Programs 
                
                                Executive Scholar Certificate 
                
                                Request A Brochure 
                
                                Find a Program 
                
                                Contact us 
                
                                 
                
            
            
        

        
        
            Group &amp; Custom Solutions
            Group &amp; Custom Solutions
            

                
                                Our Partnership Philosophy 
                
                                Design Process &amp; Team 
                
                                Association &amp; Specialty Programs 
                
                                Academic Partners 
                
                                Group Registrations 
                
                                Inquiry Form 
                
                                Contact Us 
                
            
            
        

        
        
            The Kellogg Experience
            The Kellogg Experience
            

                
                                The Kellogg Advantage 
                
                                Our Learning Environment 
                
                                FAQs 
                
                                Our Faculty 
                
                                Thought Leadership 
                
                                Participant Perspectives 
                
                                Alumni Benefits 
                
                                Request A Brochure 
                
                                Subscribe to Newsletter 
                
                                Find a Program 
                
                                Contact us 
                
                                 
                
            
            
        

        
    



                
                
                    
                    
                        
                            
                                
                                    
                                                
                                                                                                                                     
                                                
                                    
                                
                            
                        
                        
                    
                    
                    
                    
                
            
                
                    
                        
                            
                                Campuses
                                
                                    
                                        
                                            Evanston
                                            
                                        
                                    
                                        
                                            Chicago
                                            
                                        
                                    
                                        
                                            Miami
                                            
                                        
                                    
                                        
                                            Directions
                                            
                                        
                                    
                                
                            
                        
                            
                                Gain Insight
                                
                                    
                                        
                                            Subscribe to our Newsletter
                                            
                                        
                                    
                                        
                                            Kellogg Faculty Blogs
                                            
                                        
                                    
                                        
                                            Read Kellogg Insight
                                            
                                        
                                    
                                
                            
                        
                            
                                Connect with Us
                                
                                    
                                        
                                            LinkedIn
                                            
                                        
                                    
                                        
                                            Twitter
                                            
                                        
                                    
                                        
                                            Facebook
                                            
                                        
                                    
                                
                            
                        
                    
                
            
            
            
                Kellogg School of Management
                
James L. Allen Center
2169 Campus Drive, Evanston, IL 60208
Directions
847.467.6018

                
            
        
            
        
    

    
        
    

    
        
        
            
                

    

    
    Custom Program Inquiry Form


    
    
        
            
            Executive Education
            
            
            
            
            
        
    
    


                 
                


    
        
            
                


    
    

    

        
            
            
            


            
                
                
                
                
                


                    
                    


                    
                    
                    
                        
                        Your organization has unique educational needs. Please tell us about yourself in the form below so that we can help you support your goals. An Executive Education consultant will contact you regarding your initiative within two business days.
                        
                    
                    

                    
                    

                    
                    




                    
                
                
                
            
            
        
        
    
    







    
    

    

        
            
            
            


            
                
                
                
                
                


                    
                    


                    
                    
                    
                        
                        

.klg-breadcrumbs {
	display: none !important;
}
h1 {
    font-family: &quot;Roboto Slab&quot;,Georgia,Times,serif !important;
}
.form-control {
	width: inherit;
	float: none;
}
.form-container h3 {
	background: #eaeaea none repeat scroll 0 0;
	color: #4f2582;
	font-size: 24px;
	padding: 5px 15px;
	font-family: &quot;Roboto Slab&quot;, Georgia, Times, serif;
	font-weight: 300;
}
.form-container .btn-info {
	background-color: #4f2582;
	border-color: #4f2582;
}
.form-container .btn-info:hover {
	background-color: #612EA0;
	border-color: #612EA0;
}
.form-container #mailingAddress {
	display: none;
}
.collapseTitle {
	border-bottom: 1px solid #a69c95;
	color: #4f2582;
	cursor: pointer;
	font-size: 16px;
	font-weight: normal;
	line-height: 5px;
	margin-bottom: 0;
	margin-top: 12px;
	padding-right: 10px;
	padding: 10px 5px;
}
.collapseTitle:hover {
	background-color: #eeeeee;
}
.collapsePlus {
	color: #353535;
	float: right;
	font-size: 22px;
	letter-spacing: -9px;
	line-height: 1px;
	padding: 12px;
	position: relative;
	top: -8px;
}
.collapseDiv {
	margin: 0px;
	padding: 10px 0 0 10px;
}
.collapseDiv > div {
	position: relative;
	margin: 1em 20px;
}
.collapseDiv label {
	font-weight: normal;
	display: inline-block;
}
.collapseDiv input {
	left: -18px;
	margin: 0;
	position: absolute;
	top: 2px;
}
.parsley-error {
	background-color: #f2dede;
	border: 1px solid #d58282;
    box-shadow: none;
}
.parsley-success {
    background-color: #dff0d8;
    border: 1px solid #879880;
    box-shadow: none;
}
.parsley-errors-list.filled {
	color: #d58282;
	list-style: outside none none;
	padding: 0;
}





  
  


    














	
	
	
	
	
	
	
	
	
	
	
	
	Contact Information
First Name *

Last Name *

Title

Company *

Department:

Email *

Phone

Mobile


      
      Next > 



Contact Information
Street

Postal Code

City

State/Province--None--Acre
Agrigento
Aguascalientes
Alabama
Alagoas
Alaska
Alberta
Alessandria
Amapá
Amazonas
American Samoa
Ancona
Andaman and Nicobar Islands
Andhra Pradesh
Anhui
Aosta
Arezzo
Arizona
Arkansas
Armed Forces Americas
Armed Forces Europe
Arunachal Pradesh
Ascoli Piceno
Assam
Asti
Australian Capital Territory
Avellino
Bahia
Baja California
Baja California Sur
Bari
Barletta-Andria-Trani
Beijing
Belluno
Benevento
Bergamo
Biella
Bihar
Bologna
Bolzano
Brescia
Brindisi
British Columbia
Cagliari
California
Caltanissetta
Campeche
Campobasso
Carbonia-Iglesias
Carlow
Caserta
Catania
Catanzaro
Cavan
Ceará
Chandigarh
Chhattisgarh
Chiapas
Chieti
Chihuahua
Chinese Taipei
Chongqing
Clare
Coahuila
Colima
Colorado
Como
Connecticut
Cork
Cosenza
Cremona
Crotone
Cuneo
Dadra and Nagar Haveli
Daman and Diu
Delaware
Delhi
District of Columbia
Distrito Federal
Donegal
Dublin
Durango
Enna
Espírito Santo
Federal District
Fermo
Ferrara
Florence
Florida
Foggia
Forlì-Cesena
Frosinone
Fujian
Galway
Gansu
Genoa
Georgia
Goa
Goiás
Gorizia
Grosseto
Guam
Guanajuato
Guangdong
Guangxi
Guerrero
Guizhou
Gujarat
Hainan
Haryana
Hawaii
Hebei
Heilongjiang
Henan
Hidalgo
Himachal Pradesh
Hong Kong
Hubei
Hunan
Idaho
Illinois
Imperia
Indiana
Iowa
Isernia
Jalisco
Jammu and Kashmir
Jharkhand
Jiangsu
Jiangxi
Jilin
Kansas
Karnataka
Kentucky
Kerala
Kerry
Kildare
Kilkenny
L'Aquila
Lakshadweep
Laois
La Spezia
Latina
Lecce
Lecco
Leitrim
Liaoning
Limerick
Livorno
Lodi
Longford
Louisiana
Louth
Lucca
Macao
Macerata
Madhya Pradesh
Maharashtra
Maine
Manipur
Manitoba
Mantua
Maranhão
Marshall Islands
Maryland
Massa and Carrara
Massachusetts
Matera
Mato Grosso
Mato Grosso do Sul
Mayo
Meath
Medio Campidano
Meghalaya
Messina
Mexico State
Michigan
Michoacán
Milan
Minas Gerais
Minnesota
Mississippi
Missouri
Mizoram
Modena
Monaghan
Montana
Monza and Brianza
Morelos
Nagaland
Naples
Nayarit
Nebraska
Nei Mongol
Nevada
New Brunswick
Newfoundland and Labrador
New Hampshire
New Jersey
New Mexico
New South Wales
New York
Ningxia
North Carolina
North Dakota
Northern Territory
Northwest Territories
Novara
Nova Scotia
Nuevo León
Nunavut
Nuoro
Oaxaca
Odisha
Offaly
Ogliastra
Ohio
Oklahoma
Olbia-Tempio
Ontario
Oregon
Oristano
Padua
Palau
Palermo
Pará
Paraíba
Paraná
Parma
Pavia
Pennsylvania
Pernambuco
Perugia
Pesaro and Urbino
Pescara
Piacenza
Piauí
Pisa
Pistoia
Pordenone
Potenza
Prato
Prince Edward Island
Puducherry
Puebla
Puerto Rico
Punjab
Qinghai
Quebec
Queensland
Querétaro
Quintana Roo
Ragusa
Rajasthan
Ravenna
Reggio Calabria
Reggio Emilia
Rhode Island
Rieti
Rimini
Rio de Janeiro
Rio Grande do Norte
Rio Grande do Sul
Rome
Rondônia
Roraima
Roscommon
Rovigo
Salerno
San Luis Potosí
Santa Catarina
São Paulo
Saskatchewan
Sassari
Savona
Sergipe
Shaanxi
Shandong
Shanghai
Shanxi
Sichuan
Siena
Sikkim
Sinaloa
Sligo
Sondrio
Sonora
South Australia
South Carolina
South Dakota
Syracuse
Tabasco
Tamaulipas
Tamil Nadu
Taranto
Tasmania
Tennessee
Teramo
Terni
Texas
Tianjin
Tipperary
Tlaxcala
Tocantins
Trapani
Trento
Treviso
Trieste
Tripura
Turin
Udine
United States Minor Outlying Islands
US Virgin Islands
Utah
Uttarakhand
Uttar Pradesh
Varese
Venice
Veracruz
Verbano-Cusio-Ossola
Vercelli
Vermont
Verona
Vibo Valentia
Vicenza
Victoria
Virginia
Viterbo
Washington
Waterford
West Bengal
Western Australia
Westmeath
West Virginia
Wexford
Wicklow
Wisconsin
Wyoming
Xinjiang
Xizang
Yucatán
Yukon Territories
Yunnan
Zacatecas
Zhejiang


Country--None--Afghanistan
Aland Islands
Albania
Algeria
Andorra
Angola
Anguilla
Antarctica
Antigua and Barbuda
Argentina
Armenia
Aruba
Australia
Austria
Azerbaijan
Bahamas
Bahrain
Bangladesh
Barbados
Belarus
Belgium
Belize
Benin
Bermuda
Bhutan
Bolivia, Plurinational State of
Bonaire, Sint Eustatius and Saba
Bosnia and Herzegovina
Botswana
Bouvet Island
Brazil
British Indian Ocean Territory
Brunei Darussalam
Bulgaria
Burkina Faso
Burundi
Cambodia
Cameroon
Canada
Cape Verde
Cayman Islands
Central African Republic
Chad
Chile
China
Chinese Taipei
Christmas Island
Cocos (Keeling) Islands
Colombia
Comoros
Congo
Congo, the Democratic Republic of the
Cook Islands
Costa Rica
Cote d'Ivoire
Croatia
Cuba
Curaçao
Cyprus
Czech Republic
Denmark
Djibouti
Dominica
Dominican Republic
Ecuador
Egypt
El Salvador
Equatorial Guinea
Eritrea
Estonia
Ethiopia
Falkland Islands (Malvinas)
Faroe Islands
Fiji
Finland
France
French Guiana
French Polynesia
French Southern Territories
Gabon
Gambia
Georgia
Germany
Ghana
Gibraltar
Greece
Greenland
Grenada
Guadeloupe
Guatemala
Guernsey
Guinea
Guinea-Bissau
Guyana
Haiti
Heard Island and McDonald Islands
Holy See (Vatican City State)
Honduras
Hungary
Iceland
India
Indonesia
Iran, Islamic Republic of
Iraq
Ireland
Isle of Man
Israel
Italy
Jamaica
Japan
Jersey
Jordan
Kazakhstan
Kenya
Kiribati
Korea, Democratic People's Republic of
Korea, Republic of
Kuwait
Kyrgyzstan
Lao People's Democratic Republic
Latvia
Lebanon
Lesotho
Liberia
Libyan Arab Jamahiriya
Liechtenstein
Lithuania
Luxembourg
Macao
Macedonia, the former Yugoslav Republic of
Madagascar
Malawi
Malaysia
Maldives
Mali
Malta
Martinique
Mauritania
Mauritius
Mayotte
Mexico
Moldova, Republic of
Monaco
Mongolia
Montenegro
Montserrat
Morocco
Mozambique
Myanmar
Namibia
Nauru
Nepal
Netherlands
New Caledonia
New Zealand
Nicaragua
Niger
Nigeria
Niue
Norfolk Island
Norway
Oman
Pakistan
Palestinian Territory, Occupied
Panama
Papua New Guinea
Paraguay
Peru
Philippines
Pitcairn
Poland
Portugal
Qatar
Reunion
Romania
Russian Federation
Rwanda
Saint Barthélemy
Saint Helena, Ascension and Tristan da Cunha
Saint Kitts and Nevis
Saint Lucia
Saint Martin (French part)
Saint Pierre and Miquelon
Saint Vincent and the Grenadines
Samoa
San Marino
Sao Tome and Principe
Saudi Arabia
Senegal
Serbia
Seychelles
Sierra Leone
Singapore
Sint Maarten (Dutch part)
Slovakia
Slovenia
Solomon Islands
Somalia
South Africa
South Georgia and the South Sandwich Islands
South Sudan
Spain
Sri Lanka
Sudan
Suriname
Svalbard and Jan Mayen
Swaziland
Sweden
Switzerland
Syrian Arab Republic
Tajikistan
Tanzania, United Republic of
Thailand
Timor-Leste
Togo
Tokelau
Tonga
Trinidad and Tobago
Tunisia
Turkey
Turkmenistan
Turks and Caicos Islands
Tuvalu
Uganda
Ukraine
United Arab Emirates
United Kingdom
United States
Uruguay
Uzbekistan
Vanuatu
Venezuela, Bolivarian Republic of
Viet Nam
Virgin Islands, British
Wallis and Futuna
Western Sahara
Yemen
Zambia
Zimbabwe

&lt; Back
Next >



Program Details
Describe your areas of interest and goals for an executive educational program.

Describe the profile of the program participants (age, work experience, educational background).

When do you want to conduct the program?

How many participants will attend?

What are your desired outcomes for the program?


&lt; Back
      


  

 
 
 

$.noConflict();
jQuery( document ).ready(function( $ ) {

            (function($) {
                $(function() {
                    var duration = 500;

                    var elements = {
                        country: $('#country_code'),
                        state_short: $('#state_code'),
                        city: $('#city'),
                        zip: $('#zip')
                    }


                    // Initialize the ziptastic and bind to the change of zip code
                    elements.zip.ziptastic()
                        .on('zipChange', function(evt, country, state, state_short, city, zip) {
                            // Country
                            elements.country.val(country).parent().show(duration);

                            // State
                            elements.state_short.val(state_short).parent().show(duration);
                            //elements.state.val(state).parent().show(duration);

                            // City
                            elements.city.val(city).parent().show(duration);

                        });
                });
            }(jQuery));


$(document).ready(function() {

$('.next').on('click', function () {
    var current = $(this).data('currentBlock'),
      next = $(this).data('nextBlock');

    // only validate going forward. If current group is invalid, do not go further
    // .parsley().validate() returns validation result AND show errors
    if (next > current)
      if (false === $('#customProgramInquiry').parsley().validate('block' + current))
        return;

    // validation was ok. We can go on next step.
    $('.block' + current)
      .removeClass('show')
      .addClass('hidden');

    $('.block' + next)
      .removeClass('hidden')
      .addClass('show');

  });

    $('.selectall').click(function(event) {  //on click 
        if(this.checked) { // check select status
            $('.checkbox').each(function() { //loop through each checkbox
                this.checked = true;  //select all checkboxes with class &quot;checkbox&quot;      			
            });
			$('.collapseDiv').slideDown(500);	
        }else{
            $('.checkbox').each(function() { //loop through each checkbox
                this.checked = false; //deselect all checkboxes with class &quot;checkbox&quot;                       
            });
			$('.collapseDiv').slideUp(500);				
        }
    });
	
	$(&quot;.btn-hardCopy&quot;).click(function () {

    $header = $(this);
    //getting the next element
    $content = $('#mailingAddress')
    //open up the content needed - toggle the slide- if visible, slide up, if not slidedown.
    $content.slideToggle(500, function () {
        //execute this after slideToggle is done
        //change text of header based on visibility of content div
        $header.text(function () {
            //change text based on condition
            return $content.is(&quot;:visible&quot;) ? &quot;Collapse&quot; : &quot;Expand&quot;;
        });
    });

});
	
	
	//BEGIN KSM CUSTOM JS
var KSMQueryString;
var KSMParsedQS;
var KSMQSfield;
var KSMBrochureCode;
var i;
var j;
var KSMCheckbox;

KSMQueryString = window.location.search.substring(1).split(&quot;&amp;&quot;);

for (i=0;i &lt;KSMQueryString.length;i++) {
	KSMParsedQS = KSMQueryString[i].split(&quot;=&quot;);
	if (KSMParsedQS[0] == 'pc') {
		KSMBrochureCode = KSMParsedQS[1];
		KSMBrochureCode = KSMBrochureCode.split(&quot;,&quot;);
	}
}

KSMCheckbox = document.forms['customProgramInquiry'].elements;

for(j = 0; j&lt;KSMBrochureCode.length; j++){

	for(i = 0; i&lt;KSMCheckbox.length; i++) {
		if (KSMCheckbox[i].title == KSMBrochureCode[j]) {
			KSMCheckbox[i].checked = true;
			$(KSMCheckbox[i]).parents('.collapseDiv').slideDown(500);
		}
	}
}

document.getElementById('00N32000003F50o').value = $.cookie('cust-landing');  //landing page from cookie
document.getElementById('00N32000003F51B').value = $.cookie('cust-guid');  //tracking guid from cookie
document.getElementById('00N32000003F50y').value = $.cookie('cust-referrer');  //referring page from cookie
document.getElementById('00N32000003F93f').value = document.URL;  //current page
	
});
});

 

                        
                    
                    

                    
                    

                    
                    




                    
                
                
                
            
            
        
        
    
    





            

        

        
            
                

    Take Action
    
        
            
                Inquiry Form
                                                                                 
            

        
            
                Contact Us
                                                                                 
            

        
    


            
        
    



        
            
        
        
        

        
        
            
                
                    
                        Kellogg / inspiring growth
                    
                
                
                    
                        Northwestern University
                    
                
            
            
                
                    
                        
                            Kellogg School of Management
                            
James L. Allen Center
2169 Campus Drive, Evanston, IL 60208
Directions
847.467.6018

                        
                        
                    
                    
                        
                            
                                
                                    
                                        Campuses
                                        
                                            
                                                
                                                    Evanston
                                                    
                                                
                                            
                                                
                                                    Chicago
                                                    
                                                
                                            
                                                
                                                    Miami
                                                    
                                                
                                            
                                                
                                                    Directions
                                                    
                                                
                                            
                                        
                                    
                                
                                    
                                        Gain Insight
                                        
                                            
                                                
                                                    Subscribe to our Newsletter
                                                    
                                                
                                            
                                                
                                                    Kellogg Faculty Blogs
                                                    
                                                
                                            
                                                
                                                    Read Kellogg Insight
                                                    
                                                
                                            
                                        
                                    
                                
                                    
                                        Connect with Us
                                        
                                            
                                                
                                                    LinkedIn
                                                    
                                                
                                            
                                                
                                                    Twitter
                                                    
                                                
                                            
                                                
                                                    Facebook
                                                    
                                                
                                            
                                        
                                    
                                
                            
                            
                        
                        
                    
                
                
                
                    ©
Kellogg School of Management


Northwestern University

All Rights Reserved. Policy Statements
Site Map
                
                
            
            
        
        

    


      

    
    
    
    
    
    
	
	
	
    
    
	



 
var addthis_config = { 
data_ga_property: 'UA-5154363-1', 
data_ga_social : true 
};  


    
    


var dataLayer=&quot;undefined&quot;!==typeof dataLayer&amp;&amp;dataLayer instanceof Array?dataLayer:[],gtmYTPlayers=[],x,e=document.getElementsByTagName(&quot;iframe&quot;);for(x=e.length;x--;)/youtube.com\/embed/.test(e[x].src)&amp;&amp;-1===e[x].src.indexOf(&quot;enablejsapi\x3d&quot;)&amp;&amp;(e[x].src+=(-1===e[x].src.indexOf(&quot;?&quot;)?&quot;?&quot;:&quot;\x26&quot;)+&quot;enablejsapi\x3d1&quot;);
function onPlayerStateChange(a){try{a.data==YT.PlayerState.PLAYING&amp;&amp;setTimeout(onPlayerPercent,1E3,a.target);var b=a.target.getVideoData(),c=&quot;youtube: &quot;+b.title;a.data==YT.PlayerState.PLAYING&amp;&amp;&quot;p&quot;==YT.gtmLastAction&amp;&amp;(dataLayer.push({event:&quot;video&quot;,category:&quot;youtube&quot;,action:&quot;youtube video play&quot;,label:c,nonInteractive:!0}),YT.gtmLastAction=&quot;&quot;);a.data==YT.PlayerState.PAUSED&amp;&amp;&quot;&quot;==YT.gtmLastAction&amp;&amp;(dataLayer.push({event:&quot;video&quot;,category:&quot;youtube&quot;,action:&quot;youtube video pause&quot;,label:c}),YT.gtmLastAction=
&quot;p&quot;)}catch(d){}}function onPlayerError(a){try{dataLayer.push({event:&quot;videoError&quot;,category:&quot;youtube&quot;,action:&quot;youtube error&quot;,label:&quot;youtube: &quot;+a,nonInteractive:!0})}catch(b){}}
function onPlayerPercent(a){try{if(a.getPlayerState()==YT.PlayerState.PLAYING){var b=1.5>=a.getDuration()-a.getCurrentTime()?1:(Math.floor(a.getCurrentTime()/a.getDuration()*4)/4).toFixed(2);if((!a.lastP||b>a.lastP)&amp;&amp;0!=parseFloat(b)){var c=a.getVideoData(),d=&quot;youtube: &quot;+c.title;a.lastP=b;dataLayer.push({event:&quot;video&quot;,category:&quot;youtube&quot;,action:&quot;youtube video &quot;+100*b+&quot;% complete&quot;,label:d,nonInteractive:!0})}1!=a.lastP&amp;&amp;setTimeout(onPlayerPercent,1E3,a)}}catch(g){}}
if(&quot;function&quot;!==typeof onYouTubeIframeAPIReady){var j=document.createElement(&quot;script&quot;),f=document.getElementsByTagName(&quot;script&quot;)[0];j.src=&quot;//www.youtube.com/iframe_api&quot;;j.async=!0;f.parentNode.insertBefore(j,f)}
var ytwait=setInterval(function(){if(&quot;object&quot;===typeof YT&amp;&amp;&quot;function&quot;===typeof YT.Player){clearInterval(ytwait);var a,b=document.getElementsByTagName(&quot;iframe&quot;);for(a=b.length;a--;)if(/youtube.com\/embed/.test(b[a].src))try{var c=YT.get(b[a].id);console.dir(c);c||(c=new YT.Player(b[a],{events:{onStateChange:onPlayerStateChange,onError:onPlayerError}}));c.addEventListener(&quot;onStateChange&quot;,onPlayerStateChange);c.addEventListener(&quot;onError&quot;,onPlayerError);gtmYTPlayers.push(c);YT.gtmLastAction=&quot;p&quot;}catch(d){}}},
500);/html[@class=&quot;js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers no-applicationcache no-svg no-inlinesvg no-smil no-svgclippaths&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers no-applicationcache no-svg no-inlinesvg no-smil no-svgclippaths&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//html</value>
   </webElementXpaths>
</WebElementEntity>
