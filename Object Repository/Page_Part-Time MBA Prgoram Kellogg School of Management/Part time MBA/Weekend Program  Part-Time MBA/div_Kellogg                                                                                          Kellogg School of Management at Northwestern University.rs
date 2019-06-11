<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Kellogg                                                                                          Kellogg School of Management at Northwestern University</name>
   <tag></tag>
   <elementGuidId>55b1abc2-5944-495a-83f7-9f2f502cc7b6</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='klg-wrapper']</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>klg-wrapper</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>klg-offcanvas-right </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
            
    
        
                Kellogg School of Management at Northwestern University
        
        
            
                

                
                    
                        Kellogg School of Management at Northwestern University
                    
                
				
				
                 

    
		






	
	
	
		    		
                
                
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



            
        
        

        
            
                
                    
                        Kellogg School of Management at Northwestern University
                    
                

                
                    Toggle navigation
                

                  
                    
                    
                

                PROGRAMS
                

            
            
                
                




    
    
        About
        
            
                            
                    
                            
                                
                                    About Kellogg
                                    
                                              Meet Dean Hagerty
                                    Global Impact
                                    
                                              Executive MBA Network
                                    
                                              Global Initiatives in Management
                                    

                                
                            
                    
                            
                                
                                    Diversity &amp; Inclusion
                                    
                                              Our Community
                                    
                                              Women at Kellogg
                                    Leadership
                                    
                                              Department Chairs
                                    
                                              Strategic Initiative Faculty Directors
                                    
                                              Global Advisory Board
                                    
                                              Student Leadership Teams
                                    

                                
                            
                    
                            
                                
                                    Kellogg Giving Network
                                    
                                              Ways to Give
                                    
                                              Donors
                                    Global Hub
                                    

                                
                            
                    
                            
                                
                                    
                                            
                                                Our Purpose
                                                To educate, equip &amp; inspire brave leaders who build strong organizations and wisely leverage the power of markets to create lasting value.
                                            
                                    

                                
                            
                    
        
    
    
    
        Programs
        
            
            
                            
                                
                                    
                                        
                                            
                                                
                                            
                                           
                                            Why Kellogg
                                            At Kellogg, we develop brave leaders that inspire growth in people, organizations and markets.
                                            Learn more about the Kellogg difference
                                        
                                    
                                
                            

                    
                            
                                
                                    All Programs
                                    Full-Time MBA
                                    
                                              Admissions
                                    
                                              Academics
                                    
                                              Class Profile
                                    
                                              Career Development
                                    
                                              Tuition &amp; Financial Aid
                                    
                                              Attend an Event
                                    
                                              Visit Kellogg
                                    
                                              Apply
                                    Evening &amp; Weekend
                                    
                                              Admissions
                                    
                                              Academics
                                    
                                              Class Profile
                                    
                                              Career Development
                                    
                                              Tuition &amp; Financial Aid
                                    
                                              Attend an Event
                                    
                                              Visit Kellogg
                                    
                                              Apply
                                    

                                
                            
                    
                            
                                
                                    Executive MBA
                                    
                                              Admissions
                                    
                                              Academics
                                    
                                              Locations &amp; Schedules
                                    
                                              Class Profile
                                    
                                              Career Development
                                    
                                              Tuition &amp; Financing
                                    
                                              Attend an Event
                                    
                                              Visit Kellogg
                                    
                                              Apply
                                    Doctoral
                                    
                                              Admissions
                                    
                                              Programs
                                    
                                              Research
                                    
                                              PhD Classes &amp; Schedule
                                    
                                              Recruiting Forums
                                    
                                              Request Info
                                    
                                              Apply
                                    

                                
                            
                    
                            
                                
                                    Certificate Program for Undergraduates
                                    
                                              Admissions
                                    
                                              Academics
                                    
                                              Program Benefits
                                    
                                              Career Development
                                    
                                              Jobs &amp; Internships
                                    
                                              Apply
                                    MS in Management Studies
                                    
                                              Admissions
                                    
                                              Academics
                                    
                                              Career Development
                                    
                                              Tuition &amp; Financial Aid
                                    
                                              Attend an Event
                                    
                                              Apply
                                    

                                
                            
                    
            
                            
                                
                                    
                                        
                                            
                                                
                                            
                                           
                                            Propel Your Career
                                            Earning a Kellogg Evening &amp; Weekend MBA can take you to the top of your organization and prepare you for a lifetime of success.
                                            Learn More
                                        
                                    
                                
                            

                    
        
    
    
    
        Executive Education
        
            
            
                            
                                
                                    
                                        
                                            
                                                
                                            
                                           
                                            Executive Scholar Certificate
                                            Earn a credential customized to your professional development goals.
                                            Learn More
                                        
                                    
                                
                            

                    
                            
                                
                                    Individual Programs
                                    
                                              Executive Programs
                                    
                                              C-Suite Programs
                                    
                                              Nonprofit Programs
                                    
                                              Executive Scholar Certificate
                                    
                                              Online Programs
                                    

                                
                            
                    
                            
                                
                                    Group &amp; Custom Solutions
                                    
                                              Our Partnership Philosophy
                                    
                                              Design Process &amp; Team
                                    
                                              Association &amp; Specialty Programs
                                    
                                              Academic Partners
                                    
                                              Group Registrations
                                    
                                              Inquire
                                    

                                
                            
                    
                            
                                
                                    The Kellogg Experience
                                    
                                              The Kellogg Advantage
                                    
                                              Our Learning Environment
                                    
                                              Our Faculty
                                    
                                              Thought Leadership
                                    
                                              Participant Perspectives
                                    
                                              Alumni Benefits
                                    

                                
                            
                    
                            
                                
                                    Request a Brochure
                                    Find a Program
                                    Contact Us
                                    
                                            
                                                
                                                
Saved Programs 0 

                                            
                                    

                                
                            
                    
        
    
    
    
        Faculty and Research
        
            
            
                            
                                
                                    
                                        
                                            
                                                
                                            
                                           
                                            Career Successes Come in Clusters
                                            Bursts of brilliance happen for everyone. Explore the &quot;hot streaks&quot; of thousands of directors, artists, and scientists.
                                            Read More
                                        
                                    
                                
                            

                    
                            
                                
                                    Faculty &amp; Research
                                    
                                              Faculty Directory
                                    
                                              Research
                                    
                                              Research Centers
                                    
                                              Events
                                    
                                              Faculty Experts Guide
                                    
                                              Case Publishing
                                    
                                              Kellogg Insight Magazine
                                    

                                
                            
                    
                            
                                
                                    Academic Departments
                                    
                                              Accounting Information &amp; Management
                                    
                                              Finance
                                    
                                              Management &amp; Organizations
                                    
                                              Managerial Economics &amp; Decision Sciences
                                    
                                              Marketing
                                    
                                              Operations
                                    
                                              Strategy
                                    

                                
                            
                    
                            
                                
                                    Strategic Initiatives
                                    
                                              Architectures of Collaboration
                                    
                                              Innovation &amp; Entrepreneurship
                                    
                                              Markets &amp; Customers
                                    
                                              Public-Private Interface
                                    

                                
                            
                    
                            
                                
                                    

                                
                            
                    
        
    
    
    
        Alumni
        
            
            
                            
                                
                                    
                                        
                                            
                                                
                                            
                                           
                                            Stay Connected &amp; Be Informed
                                            Create a new profile or update your information in the Northwestern Directory to receive the latest Kellogg news, publications, event invitations and alumni benefit updates.
                                            Visit Our Northwestern today!
                                        
                                    
                                
                            

                    
                            
                                
                                    Connect
                                    
                                              Clubs &amp; Affinity Networks
                                    
                                              Reunion Classes by Year
                                    
                                              Kellogg Alumni Council
                                    
                                              Pete Henderson Society
                                    Learn &amp; Develop
                                    Career Development
                                    
                                              Career Coaching
                                    
                                              Kellogg Insight: Careers
                                    

                                
                            
                    
                            
                                
                                    News &amp; Impact
                                    
                                              Kellogg Magazine
                                    Reunion
                                    Events
                                    Volunteer
                                    
                                              Ways to Volunteer
                                    
                                              Club &amp; Affinity Network Leaders
                                    

                                
                            
                    
                            
                                
                                    Give
                                    
                                              Why Give?
                                    
                                              Ways to Give
                                    
                                              Kellogg Leadership Circle
                                    
                                              Our Donors
                                    
                                              Donor Honor Roll
                                    
                                              Impact Reports
                                    

                                
                            
                    
                            
                                
                                    Profile
                                    Directory
                                    Contact Us
                                    Donate Now
                                    

                                
                            
                    
        
    
    




    

    

        
        
            About
            About
            

                
                                About Kellogg 
                
                                Global Impact 
                
                                Diversity &amp; Inclusion 
                
                                Leadership 
                
                                Kellogg Giving Network 
                
                                Global Hub 
                
                                 
                
            
            
        

        
        
            Programs
            Programs
            

                
                                All Programs 
                
                                Full-Time MBA 
                
                                Evening &amp; Weekend 
                
                                Executive MBA 
                
                                Doctoral 
                
                                Certificate Program for Undergraduates 
                
                                MS in Management Studies 
                
            
            
        

        
        
            Executive Education
            Executive Education
            

                
                                Individual Programs 
                
                                Group &amp; Custom Solutions 
                
                                The Kellogg Experience 
                
                                Request a Brochure 
                
                                Find a Program 
                
                                Contact Us 
                
                                 
                
            
            
        

        
        
            Faculty and Research
            Faculty and Research
            

                
                                Faculty &amp; Research 
                
                                Academic Departments 
                
                                Strategic Initiatives 
                
            
            
        

        
        
            Alumni
            Alumni
            

                
                                Connect 
                
                                Learn &amp; Develop 
                
                                Career Development 
                
                                News &amp; Impact 
                
                                Reunion 
                
                                Events 
                
                                Volunteer 
                
                                Give 
                
                                Profile 
                
                                Directory 
                
                                Contact Us 
                
                                Donate Now 
                
            
            
        

        
    



            
                
                    
                      
                
            
                
                    
                        
                            
                                Campuses
                                
                                    
                                        
                                            Chicago
                                            
                                        
                                    
                                        
                                            Evanston
                                            
                                        
                                    
                                        
                                            Global Network
                                            
                                        
                                    
                                        
                                            Miami
                                            
                                        
                                    
                                
                            
                        
                            
                                Info For
                                
                                    
                                        
                                            Alumni
                                            
                                        
                                    
                                        
                                            Corporate Visitors
                                            
                                        
                                    
                                        
                                            Current Students
                                            
                                        
                                    
                                        
                                            Staff Intranet
                                            
                                        
                                    
                                        
                                            Faculty Intranet
                                            
                                        
                                    
                                        
                                            Recruiters
                                            
                                        
                                    
                                
                            
                        
                            
                                Strategic Initiatives
                                
                                    
                                        
                                            Architectures of Collaboration
                                            
                                        
                                    
                                        
                                            Innovation &amp; Entrepreneurship
                                            
                                        
                                    
                                        
                                            Markets &amp; Customers
                                            
                                        
                                    
                                        
                                            Public-Private Interface
                                            
                                        
                                    
                                
                            
                        
                            
                                Learn about
                                
                                    
                                        
                                            Healthcare
                                            
                                        
                                    
                                        
                                            Entrepreneurship
                                            
                                        
                                    
                                        
                                            Social Impact
                                            
                                        
                                    
                                        
                                            Trust
                                            
                                        
                                    
                                        
                                            Negotiation
                                            
                                        
                                    
                                        
                                            Leadership
                                            
                                        
                                    
                                        
                                            Brand Management
                                            
                                        
                                    
                                        
                                            Data Analytics
                                            
                                        
                                    
                                        
                                            Policy and Public Impact
                                            
                                        
                                    
                                
                            
                        
                            
                                Follow us
                                
                                    
                                        
                                            Twitter
                                            
                                        
                                    
                                        
                                            Linkedin
                                            
                                        
                                    
                                        
                                            Facebook
                                            
                                        
                                    
                                        
                                            Google+
                                            
                                        
                                    
                                        
                                            YouTube
                                            
                                        
                                    
                                
                            
                        
                    
                
            
            
            
                Kellogg School of Management
                
Northwestern University
340 E. Superior Street, Chicago, IL 60611

                
            
        
            
        
   

        
        
            
                

    
    Evening &amp; Weekend MBA Program
    
    
        
            
        
    
    


    
    
        
                        
                        
                           Leadership and career development
                            
                        

                        
                                
                                    
                                        
                                            Accelerate your growth as a brave leader
                                        
                                    
                                    
                                    
                                
                        
                        
                    
                        
                        
                           Flexibility for the working professional
                            
                        

                        
                                
                                    
                                        
                                            Take classes on weeknights, Friday afternoons and evenings, and Saturdays
                                        
                                    
                                    
                                    
                                
                        
                        
                    
                        
                        
                           Distinctive culture
                            
                        

                        
                                
                                    
                                        
                                            Join a driven, supportive and courageous community
                                        
                                    
                                    
                                    
                                
                        
                        
                    
        
            
                

                
                            
                            
                        
                            
                            
                                
                                

                                
                                    
                                
                                
                                
                        
                        
                            
                        

                    
                        
                        
                           Distinctive culture
                            
                        

                        
                                
                                    
                                        
                                            Join a driven, supportive and courageous community
                                        
                                    
                                    
                                    
                                
                        
                        
                    
                
            
                

                
                            
                            
                        
                            
                            
                                
                                

                                
                                    
                                
                                
                                
                        
                        
                            
                        

                    
                        
                        
                           Leadership and career development
                            
                        

                        
                                
                                    
                                        
                                            Accelerate your growth as a brave leader
                                        
                                    
                                    
                                    
                                
                        
                        
                    
                
            
                

                
                            
                            
                        
                            
                            
                                
                                

                                
                                    
                                
                                
                                
                        
                        
                            
                        

                    
                        
                        
                           Flexibility for the working professional
                            
                        

                        
                                
                                    
                                        
                                            Take classes on weeknights, Friday afternoons and evenings, and Saturdays
                                        
                                    
                                    
                                    
                                
                        
                        
                    
                
            
                

                
                            
                            
                        
                            
                            
                                
                                

                                
                                    
                                
                                
                                
                        
                        
                            
                        

                    
                        
                        
                           Distinctive culture
                            
                        

                        
                                
                                    
                                        
                                            Join a driven, supportive and courageous community
                                        
                                    
                                    
                                    
                                
                        
                        
                    
                
            
                

                
                            
                            
                        
                            
                            
                                
                                

                                
                                    
                                
                                
                                
                        
                        
                            
                        

                    
                        
                        
                           Leadership and career development
                            
                        

                        
                                
                                    
                                        
                                            Accelerate your growth as a brave leader
                                        
                                    
                                    
                                    
                                
                        
                        
                    
                
            
        
            
        
            
        
        PreviousNext
    
    

                 
                


    
    
        
            

    

        
        Contact Us
        
        
            
                
                
                    
                    
                         Email
                        
                        Email
                        
                    
                    
                                  
                           
                                     
                

                
                
                    
                    
                         Call
                        
                        312.503.8385
                        
                    
                    
                                  
                           
                                     
                

                
                
                    
                    
                        
                        
                        
                        Chicago Campus
                    
                    
                                  
                           
                                     
                

                
            
        
    




    
    
        Propel your career in a top part-time MBA program
        

    

        
            
            
            


            
                
                
                
                
                


                    
                    


                    
                    
                    
                        
                        Kellogg’s top-ranked part-time MBA is designed for intelligent, ambitious leaders who want to propel their professional development without putting their careers on hold.
In the Evening &amp; Weekend MBA Program, you will master the skills and build the network you need to realize your highest career aspirations while earning an MBA part time. Only at Kellogg will you find the broadest array of global opportunities, an unparalleled approach to leadership development and a curriculum that builds well-rounded leaders. 
Customize your downtown Chicago class schedule by choosing from the Evening MBA or Weekend MBA programs, and follow a Traditional or Accelerated pace  to earn your degree. By graduation, you’ll share the same toolkit, skills and network as our most prominent alumni. 
                        
                    
                    

                    
                    

                    
                    




                    
                
                
                
            
            
        
        
    
    






    
    Why choose Kellogg’s Evening &amp; Weekend MBA Program?
    
    
                        Leadership and career development
                    
                        Flexibility for the working professional
                    
                        Distinctive culture
                    
        
        
            
                
                

                    
                    
                        Distinctive culture
                    
                    

                    
                        
                            You'll join a community of driven and supportive professionals who are committed to learning both inside and outside the classroom.
                        
                        
                            
                            
                            
                            
                        
                        
                            COURAGEOUS COMMUNITY
                            
                        
                    
                
            
        
            
                
                

                    
                    
                        Leadership and career development
                    
                    

                    
                        
                            The Kellogg Leadership Journey is designed to accelerate your development as a brave leader in a setting that allows you to look holistically at your career and professional goals.
                        
                        
                            
                            
                            
                            
                        
                        
                            Career support for a lifetime
                            
                        
                    
                
            
        
            
                
                

                    
                    
                        Flexibility for the working professional
                    
                    

                    
                        
                            The Evening &amp; Weekend MBA Program offers schedule options to fit your lifestyle and different paces to match your experience. Customize your curriculum with more than 100 electives.
                        
                        
                            
                            
                            
                            
                        
                        
                            Core &amp; electives
                            
                        
                    
                
            
        
            
                
                

                    
                    
                        Distinctive culture
                    
                    

                    
                        
                            You'll join a community of driven and supportive professionals who are committed to learning both inside and outside the classroom.
                        
                        
                            
                            
                            
                            
                        
                        
                            COURAGEOUS COMMUNITY
                            
                        
                    
                
            
        
            
                
                

                    
                    
                        Leadership and career development
                    
                    

                    
                        
                            The Kellogg Leadership Journey is designed to accelerate your development as a brave leader in a setting that allows you to look holistically at your career and professional goals.
                        
                        
                            
                            
                            
                            
                        
                        
                            Career support for a lifetime
                            
                        
                    
                
            
        
        
        
        
        
        
    



    
        Choose your schedule
    
    

    
        
        
            
                 
                                
                                    
                                    
                                    
                    
                                    
                    
                                    
                    
                                    
                                    
                                    
                                        
                                    
                                
                                

                        

               
                
                    
                    
                           
                            
                                Evening MBA
Our Evening MBA Program lets you take MBA classes during the week, right after work. The Evening Program is a popular option for professionals who live or work in the Chicago area and want to earn a part-time MBA.
                            
                        
                        
                        
                                
                                    
                                    Evening study
                                    
                                
                                

                    
                    
                
                
            
            
        
        
        
        
            
                 
                                
                                    
                                    
                                    
                    
                                    
                    
                                    
                    
                                    
                                    
                                    
                                        
                                    
                                
                                

                        

               
                
                    
                    
                           
                            
                                Weekend MBA
The Weekend MBA Program lets you spend your Saturdays immersed in class. It’s ideal for commuters or locals who like to earn their part-time MBA but travel during the week. And with the option to add Friday or weeknight classes, you’ll have ample opportunity to earn your MBA.
                            
                        
                        
                        
                                
                                    
                                    Learn on weekends
                                    
                                
                                

                    
                    
                
                
            
            
        
        
        
           
          
               Load More
               
           
        
        
    






    
        Set your pace
    
    

    
        
        
            
                 
                                
                                    
                                    
                                    
                    
                                    
                    
                                    
                    
                                    
                                    
                                    
                                        
                                    
                                
                                

                        

               
                
                    
                    
                           
                            
                                Accelerated
1–4 years to complete
Dive right into advanced electives if you’ve completed requisite business courses. 
                            
                        
                        
                        
                                
                                    
                                    Explore Accelerated Option
                                    
                                
                                

                    
                    
                
                
            
            
        
        
        
        
            
                 
                                
                                    
                                    
                                    
                    
                                    
                    
                                    
                    
                                    
                                    
                                    
                                        
                                    
                                
                                

                        

               
                
                    
                    
                           
                            
                                Traditional
1.25–5 years to complete
Complete core management courses before refining your skills in a specific area. 
                            
                        
                        
                        
                                
                                    
                                    explore traditional pace
                                    
                                
                                

                    
                    
                
                
            
            
        
        
        
           
          
               Load More
               
           
        
        
    





   
    
        
        
         
               
              Upcoming Events 
               
           
                       
                
                    
            
      
          
                
             
                            
                                            
                                        
                             
                              
.klg-ctas .klg-cta {
    width: 220px !important; 
}


    All upcoming events
 
                              
                              
                                              
                           
                         
                            
                                            
                                     March 26, 2019
12:00-12:45 pm
Live Webcast   
                             
                              Information Session: Virtual
During this webinar-style information session connect with admissions staff as they provide information about the Kellogg Evening &amp; Weekend MBA program, admissions process and application requirements. The session will include live Q&amp;A. 
                              
                              Register
                                              
                           
                         
                            
                                            
                                     April 10, 2019
6:00-8:00 pm
Wieboldt Hall
Room 440   
                             
                              Information Session: On-Campus
This interactive session will provide an opportunity for you to learn about the Kellogg Evening &amp; Weekend MBA program, admissions process and application requirements. A panel of current students will share their experiences. 
                              
                              Register
                                              
                           
                         
             
        
    

    

 




    
        Meet our part-time MBA students
    
    
        Hear what students have to say about the power of attending the Kellogg Evening &amp; Weekend MBA Program.
    
    

    
        
        
            
                 
                                
                                    
                                    
                                    
                    
                                    
                    
                                    
                    
                                    
                                    
                                    
                                        
                                    
                                
                                

                        

               
                
                    
                    
                           
                            
                                
    .h3 {
    font-size: 24px;
    font-family: &quot;Roboto Slab&quot;, Georgia, Times, serif;
    font-weight: 300;
    margin-bottom: none !important;
    margin-top: 30px;
    color: inherit;
    line-height: 1.1;
    }

Bruce Klink
Senior Manager, Capital One
“Kellogg’s Evening MBA Program hands you new opportunities, relationships and capabilities to develop the mindset of a global leader.”
                            
                        
                        
                        
                                
                                    
                                    meet bruce
                                    
                                
                                

                    
                    
                
                
            
            
        
        
        
        
            
                 
                                
                                    
                                    
                                    
                    
                                    
                    
                                    
                    
                                    
                                    
                                    
                                        
                                    
                                
                                

                        

               
                
                    
                    
                           
                            
                                
.h3 {
	font-size: 24px;
	font-family: &quot;Roboto Slab&quot;, Georgia, Times, serif;
	font-weight: 300;
	margin-bottom: none !important;
	margin-top: 30px;
	color: inherit;
	line-height: 1.1;
}

Charlie Hart
Senior Marketing Manager, Retail Leadership Development Program, Amazon
“Kellogg provided me with the momentum I needed to meet my goals faster than I could have ever anticipated.&quot; 

                            
                        
                        
                        
                                
                                    
                                    meet charlie
                                    
                                
                                

                    
                    
                
                
            
            
        
        
        
        
            
                 
                                
                                    
                                    
                                    
                    
                                    
                    
                                    
                    
                                    
                                    
                                    
                                        
                                    
                                
                                

                        

               
                
                    
                    
                           
                            
                                
.h3 {
	font-size: 24px;
	font-family: &quot;Roboto Slab&quot;, Georgia, Times, serif;
	font-weight: 300;
	margin-bottom: none !important;
	margin-top: 30px;
	color: inherit;
	line-height: 1.1;
}

/*-- remove toggle bar and show all cards --*/
    .klg-exp-grid .klg-card {display:block !important}
    .klg-exp-grid .klg-toggle {display:none !important}

Susan Wang
Senior Associate, Finance, KPMG

“Kellogg has taught me to utilize my existing finance skills to think creatively.&quot; 

                            
                        
                        
                        
                                
                                    
                                    meet susan
                                    
                                
                                

                    
                    
                
                
            
            
        
        
        
           
          
               Load More
               
           
        
        
    





    @media (max-width: 767px) {
    #emba-takeAction{
    display: none;
    }
    }



Take Action











    APPLY NOW 
    REQUEST BROCHURE 
    RÉSUMÉ REVIEW 
    ATTEND AN EVENT 
    VISIT A CLASS 















     
        

    

    
        
            

    Take Action
    
        
            
                Apply Now
                                                                                 
            

        
            
                Request Brochure
                                                                                 
            

        
            
                resume-review-registration
                                                                                 
            

        
            
                Attend an Event
                                                                                 
            

        
            
                class-visit-registration
                                                                                 
            

        
    



    
    
        
            
            
            Home

            
            
            Programs

            
            Evening &amp; Weekend MBA Program
        
    

    
{
 &quot;@context&quot;: &quot;http://schema.org&quot;,
 &quot;@type&quot;: &quot;BreadcrumbList&quot;,
 &quot;itemListElement&quot;:
 [
        { &quot;@type&quot;: &quot;ListItem&quot;, &quot;position&quot;: 1, &quot;item&quot;: { &quot;@id&quot;:&quot;/en&quot;, &quot;name&quot;:&quot;Home&quot; }},{ &quot;@type&quot;: &quot;ListItem&quot;, &quot;position&quot;: 2, &quot;item&quot;: { &quot;@id&quot;:&quot;/en/programs&quot;, &quot;name&quot;:&quot;Programs&quot; }}
 ]
}
    


    






    
    
    
    

    
    
    
    
    

    
    
    

    Pages in Evening &amp; Weekend MBA Program
    
    
        
        
            
                
                
                
                Evening MBA Program
                    
                
                
                
                
                Weekend MBA Program
                    
                
                
                
                
                Accelerated Option
                    
                
                
                
                
                Traditional Pace
                    
                
                
            
        
        
        
            
                
                
                
                Academics
                    
                
                
                
                
                Student Culture
                    
                
                
                
                
                Leadership Development
                    
                
                
                
                
                Career Development
                    
                
                
            
        
        
        
            
                
                
                
                Admissions Events
                    
                
                
                
                
                Applying
                    
                
                
                
                
                Tuition and Financial Aid
                    
                
                
            
        
        
    



        
    
    
        
        
            
    
        


        
            
        
        
        

        
        
            
                
                    
                        Kellogg / inspiring growth
                    
                
                
                    
                        Northwestern University
                    
                
            
            
                
                    
                        
                            Kellogg School of Management
                            
Northwestern University
340 E. Superior Street, Chicago, IL 60611

                        
                        
                    
                    
                        
                            
                                
                                    
                                        Campuses
                                        
                                            
                                                
                                                    Chicago
                                                    
                                                
                                            
                                                
                                                    Evanston
                                                    
                                                
                                            
                                                
                                                    Global Network
                                                    
                                                
                                            
                                                
                                                    Miami
                                                    
                                                
                                            
                                        
                                    
                                
                                    
                                        Info For
                                        
                                            
                                                
                                                    Alumni
                                                    
                                                
                                            
                                                
                                                    Corporate Visitors
                                                    
                                                
                                            
                                                
                                                    Current Students
                                                    
                                                
                                            
                                                
                                                    Staff Intranet
                                                    
                                                
                                            
                                                
                                                    Faculty Intranet
                                                    
                                                
                                            
                                                
                                                    Recruiters
                                                    
                                                
                                            
                                        
                                    
                                
                                    
                                        Strategic Initiatives
                                        
                                            
                                                
                                                    Architectures of Collaboration
                                                    
                                                
                                            
                                                
                                                    Innovation &amp; Entrepreneurship
                                                    
                                                
                                            
                                                
                                                    Markets &amp; Customers
                                                    
                                                
                                            
                                                
                                                    Public-Private Interface
                                                    
                                                
                                            
                                        
                                    
                                
                                    
                                        Learn about
                                        
                                            
                                                
                                                    Healthcare
                                                    
                                                
                                            
                                                
                                                    Entrepreneurship
                                                    
                                                
                                            
                                                
                                                    Social Impact
                                                    
                                                
                                            
                                                
                                                    Trust
                                                    
                                                
                                            
                                                
                                                    Negotiation
                                                    
                                                
                                            
                                                
                                                    Leadership
                                                    
                                                
                                            
                                                
                                                    Brand Management
                                                    
                                                
                                            
                                                
                                                    Data Analytics
                                                    
                                                
                                            
                                                
                                                    Policy and Public Impact
                                                    
                                                
                                            
                                        
                                    
                                
                                    
                                        Follow us
                                        
                                            
                                                
                                                    Twitter
                                                    
                                                
                                            
                                                
                                                    Linkedin
                                                    
                                                
                                            
                                                
                                                    Facebook
                                                    
                                                
                                            
                                                
                                                    Google+
                                                    
                                                
                                            
                                                
                                                    YouTube
                                                    
                                                
                                            
                                        
                                    
                                
                            
                            
                        
                        
                    
                
                
                
                    ©
Kellogg School of Management


Northwestern University

All Rights Reserved. Kellogg Policies | Sitemap
                
                
            
            
        
        

    </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;klg-wrapper&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='klg-wrapper']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div</value>
   </webElementXpaths>
</WebElementEntity>
