import java.io.*;
public class Game1
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);

String q_poem[]={“Two roads diverged in a yellow wood, “,
“And sorry I could not travel both “,
“And be one traveler, long I stood “,
“And looked down one as far as I could “,
“To where it bent in the undergrowth; “,
“”,
“Then took the other, as just as fair, “,
“And having perhaps the better claim, “,
“Because it was grassy and wanted wear;”,
“Though as for that the passing there “,
“Had worn them really about the same, “,
“”,
“And both that morning equally lay “,
“In leaves no step had trodden black. “,
“Oh, I kept the first for another day! “,
“Yet knowing how way leads on to way, “,
“I doubted if I should ever come back. “,
“”,
“I shall be telling this with a sigh “,
“Somewhere ages and ages hence: “,
“Two roads diverged in a wood, and I– “,
“I took the one less traveled by, “,
“And that has made all the difference. “,
“”,
” -ROBERT FROST “};

String key_poem[]={“Two roads diverged in a yellow wood, —-> Roads , Yellow Wood”,”And sorry I could not travel both —-> Sorry , Travel Both”,
“And be one traveler, long I stood —-> one , traveller”,”And looked down one as far as I could —-> Looked , One”,
“To where it bent in the undergrowth; —-> where bent , undergrowth”,” “,”Then took the other, as just as fair, —-> other , fair”,”And having perhaps the better claim, —-> better , claim”,
“Because it was grassy and wanted wear; —-> greasy , wanted wear”,”Though as for that the passing there —-> passing”,”Had worn them really about the same, —-> worn , same”
,” “,”And both that morning equally lay —-> equally , lay”,”In leaves no step had trodden black. —-> not crossed”,”Oh, I kept the first for another day! —-> first , another day”,
“Yet knowing how way leads on to way, —-> one way , other”,”I doubted if I should ever come back. —-> doubted , come back”,” “,”I shall be telling this with a sigh —-> telling , sigh”,
“Somewhere ages and ages hence: —-> after ages”,”Two roads diverged in a wood, and I– —-> took , less travelled”,”I took the one less traveled by,”,
“And that has made all the difference. —-> made , difference “};

String one_poem[]={“CHOICE”,”DESCRIPTION”,”OPINION”,”INFLUENCE”};

String q_gk[]={“What are the names of the North American Great Lakes?”,”Who are the first 8 US Presidents?”,
“What are the names of the planets in the solar system?”,”What are the seven articles of the united states constitution?”};
String ans_gk[]={“Huron, Ontario, Michigan, Erie, and Superior”,”George Washington, John Quincy Adams, Thomas Jefferson, James Madison, James Monroe, John Quincy Adams, Andrew Jackson, Martin Van Buren”,
“Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune”,”Legislative, Executive, Judicial, Supremacy, Amendment, Statehood, Ratification”};
String key_gk[]={“How Often Many Eat Sushi”,”Will A Jolly Man Make A Jolly Visitor?”,”My Very Educated Mother Just Served Us Noodles”,
“Large Elephants Jump Slowly And Sink Rapidly”};
String mne_gk[]={“HOMES”,”WAJMMAJV”,”MVEMJSUN”,”RASSLEJ”};

String q_bio[]={“What is the order of biological classification?”,” “,”Give the names of the bones of the wrist”,” “,
“How to treat a sprain?”,” “,”What are the life cycles of cells?”};
String ans_bio[]={“kingdom, phylum, class, order, family, genus, species”,” “,”Scaphoid, Lunate, Triquetral, Pisiform, Trapezium, Trapezoid, Capitate, Hamate”,” “,
“Rest the injured area, Ice the sprain, Compress with a wrap or bandage, Elevate the injured area”,” “,”Interphase, Prophase, Metaphase, Anaphase, Telophase, Cytokinesis”};
String key_bio[]={“King Phillip Cut Open Five Green Snakes”,” “,”Scaphoid, Lunate, Triquetral, Pisiform, Trapezium, Trapezoid, Capitate, Hamate”,” “,
“Rest Ice Compress Elevate”,” “,”Idiotic Penguins Make Antarctica Too Cold”};
String mne_bio[]={“PC OF GKÕS”,” “,”TTT PC SLH”,” “,”RICE”,” “,”IP MATC”};

int conti=0;
int ch,i,v,l;
String ans=””;
public void main()throws IOException
{
do
{
System.out.print(“\f”);
System.out.println(“1.Poem”);
System.out.println(“2.GK”);
System.out.println(“3.Subjects”);
System.out.println(“4.Test”);
System.out.println(“5.Result”);

System.out.println(“Enter your choice”);
while(true)
{
try
{
ch=Integer.parseInt(in.readLine());
}
catch(Exception e)
{
System.out.println(“Enter number only”);
System.out.println(“Re-Enter number only”);
continue;
}
break;
}

switch(ch)
{
case 1:
poem();
break;

case 2:
gk();
break;

case 3:
subjects();
break;

case 4:
test();
break;

case 5:
//result();
break;

default:
System.out.println(“Invalid choice”);
}
System.out.println(“Do you want to go back to Main menu then press 1”);
conti=Integer.parseInt(in.readLine());

}while(conti==1);

}

void poem()throws IOException
{
do
{
System.out.print(“\f”);
System.out.println(“1.Original”);
System.out.println(“2.Line wise keywords”);
System.out.println(“3.Paragraph wise keywords”);

System.out.println(“Enter your choice”);
while(true)
{
try
{
ch=Integer.parseInt(in.readLine());
}
catch(Exception e)
{
System.out.println(“Enter number only”);
System.out.println(“Re-Enter number only”);
continue;
}
break;
}

switch(ch)
{
case 1:
l=q_poem.length;
for(i=0;i<l;i++)
{
System.out.println(q_poem[i]);
}
break;

case 2:
l=key_poem.length;
for(i=0;i<l;i++)
{
System.out.println(key_poem[i]);
}
break;

case 3:
int z=2;
int t=0;
l=q_poem.length;
for(i=0;i<l;i++)
{

if(q_poem[i].equals(“”))
{
System.out.println();
}
else if(z==i)
{
System.out.println(q_poem[i]+”| “+one_poem[t]);
t++;
z+=6;
}
else
{
System.out.println(q_poem[i]+”|”);
}
}
break;

default:
System.out.println(“Invalid choice”);
}
System.out.println(“Do you want to go back to Poem menu then press 1”);
conti=Integer.parseInt(in.readLine());
}while(conti==1);
}

void subjects()throws IOException
{
do
{
System.out.println(“1.Physics”);
System.out.println(“2.Chemistry”);
System.out.println(“3.Biology”);

System.out.println(“Enter your choice”);
ch=Integer.parseInt(in.readLine());

switch(ch)
{
case 1:
//phy();
break;

case 2:
//chem();
break;

case 3:
//bio();
break;

default:
System.out.println(“Invalid choice”);
}
System.out.println(“Do you want to remain in subjects menu then press 1”);
conti=Integer.parseInt(in.readLine());

}while(conti==1);

}

void gk()throws IOException
{
do
{
System.out.print(“\f”);
System.out.println(“1.Original”);
System.out.println(“2.Sentence to remember”);
System.out.println(“3.Mnemonics”);

System.out.println(“Enter your choice”);
ch=Integer.parseInt(in.readLine());

switch(ch)
{
case 1:
for(i=0;i<4;i++)
{
System.out.println(“Q”+(i+1)+” “+q_gk[i]);
System.out.println(“Ans: “+ans_gk[i]);
System.out.println();
}
break;

case 2:
for(i=0;i<4;i++)
{
System.out.println(“Q”+(i+1)+” : “+q_gk[i]);
System.out.println(“Ans : “+ans_gk[i]);
System.out.println(“Sentence : “+key_gk[i]);
System.out.println();
}
break;

case 3:
for(i=0;i<4;i++)
{
System.out.println(“Q”+(i+1)+” : “+q_gk[i]);
System.out.println(“Ans : “+ans_gk[i]);
System.out.println(“Mnemonics: “+mne_gk[i]);
System.out.println();
}
break;

default:
System.out.println(“Invalid choice”);
}
System.out.println(“Do you want to remain in GK then press 1”);
conti=Integer.parseInt(in.readLine());

}while(conti==1);
}

void test()throws IOException
{
do
{
System.out.print(“\f”);
System.out.println(“1.Poem”);
System.out.println(“2.GK”);
System.out.println(“3.Physics”);
System.out.println(“4.Chemistry”);
System.out.println(“5.Biology”);

System.out.println(“Enter your choice”);
while(true)
{
try
{
ch=Integer.parseInt(in.readLine());
}
catch(Exception e)
{
System.out.println(“Enter number only”);
System.out.println(“Re-Enter number only”);
continue;
}
break;
}

switch(ch)
{
case 1:

break;

case 2:
gk_test();
break;

case 3:

break;

case 4:

break;

case 5:

break;

default:
System.out.println(“Invalid choice”);
}
System.out.println(“Do you want to go back to Test Menu then press 1”);
conti=Integer.parseInt(in.readLine());

}while(conti==1);
}

void gk_test()throws IOException
{
v=0;
for(i=0;i<4;i++)
{
System.out.println(“Q”+(i+1)+” “+q_gk[i]);
System.out.println(“Enter the Mnemonics”);
ans=in.readLine();
if(ans.equalsIgnoreCase(mne_gk[i]))
{
System.out.println(“Your ans is correct”);
v++;
}
else
{
System.out.println(“Sorry…….your ans is Wrong”);
System.out.println(“Correct ans is”);
System.out.println(“Ans : “+ans_gk[i]);
System.out.println(“Sentence : “+key_gk[i]);
System.out.println(“Mnemonics: “+mne_gk[i]);
}

System.out.println();
}
System.out.println(“Your total score: “+ v+”/4”);
System.out.println();
}
}