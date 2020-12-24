
function getElementById(name){
	return document.getElementById(name);
}

function getElementByName(name)
{
    var elements = document.getElementsByName(name);
    return elements[0];
}
function lTrim(str){
	var rtnStr;
	rtnStr="";
	for (var i=0;i<str.length;i++){
		if (str.charAt(i)!=" "){
			rtnStr=str.substr(i);
			break;
		}
	}
	return rtnStr;
}


function rTrim(str){
	var rtnStr;
	rtnStr="";
	for (var i=str.length-1;i>=0;i--){
		if (str.charAt(i)!=" "){
			rtnStr=str.substring(0,i+1);
			break;
		}
	}
	return rtnStr;
}


function trim(str){
	return(lTrim(rTrim(str)));
}


function getNameById(){
	
	var arr = arguments[0];
	var id = arguments[1];

	for(var i=0;i<arr.length;i++){
		if(arr[i][0]==id){
			return arr[i][1];
		}
	}
	return "";
}

function get_radio_value(radio_array)
{
    var i;
    for (i = 0; i < radio_array . length; ++ i){  
            if (radio_array[i].checked){
                    return radio_array[i].value;
			}
	}
    return null; 
}

function set_radio_value(radio_array,value)
{
    var i;
    for (i = 0; i < radio_array . length; ++ i){ 
            if (radio_array[i].value == value){
                    radio_array[i].checked = 'true';
			}
	}
}

function get_selected_value(selectObj)
{
	var os = selectObj.options;
    for (var i = 0; i < os.length; i++){ 
            if (os[i].selected){
                    return os[i].value;
			}
	}
    return null; 
}	

function get_selected_option(selectObj)
{
	var os = selectObj.options;
    for (var i = 0; i < os.length; i++){ 
            if (os[i].selected){
                    return os[i];
			}
	}
    return null; 
}	
	
function set_selected_value(selectObj,selectedValue)
{
	var os = selectObj.options;
    for (var i = 0; i < os.length; i++){ 
            if (os[i].value == selectedValue){
                    os[i].selected = true;
                    return;
			}
	}
}	


function isNumber(pObj){

	var obj = eval(pObj);
	strRef = "1234567890";
	
	for (i=0;i<obj.value.length;i++) {
		tempChar= obj.value.substring(i,i+1);
		if (strRef.indexOf(tempChar,0)==-1) {
			return false;
		}
	}
	return true;
}

function isIntegerOrFloat(pObj){

	var obj = eval(pObj);
	strRef = "1234567890.";
	
	for (i=0;i<obj.value.length;i++) {
		tempChar= obj.value.substring(i,i+1);
		if (strRef.indexOf(tempChar,0)==-1) {
			return false;
		}
	}
	return true;
}

function turnColor(color){
	event.srcElement.parentElement.style.backgroundColor=color;
}


	function showSubSelBySel_OBJ(){
		var parentObj = arguments[0];
		var subObj = arguments[2];
		var parentData = arguments[1];
		var subSelectedValue = arguments[3];
		
		if(parentObj == null || subObj == null || parentData == null || parentData.length == 0){
			return;
		}
		
		var parentSelectedValue = get_selected_value(parentObj);
		var subData = null;
		for(var i=0;i<parentData.length;i++){
			if(parentData[i].id == parentSelectedValue){
				subData = parentData[i].subSels;
				break;
			}
		}
		
		if(subData == null){
			subObj.style.display = "none";
			return;
		}
		
	
		var children = subObj.options;
		for(var i =1;i<children.length;){
			subObj.removeChild(children[i]);
		}
		if(children[0]!=null && children[0].value!=0){
			subObj.removeChild(children[0]);
		}
		
		for(var i=0;i<subData.length;i++){			
			opt = document.createElement("OPTION");
			subObj.options.add(opt);
			opt.value = subData[i].id;
			opt.innerText = subData[i].show;
			
			if(subSelectedValue!=null && subSelectedValue==opt.value){
				opt.selected = true;
			}
		}
		
		subObj.style.display = "block";	
	}



function check_all(obj){
    for(i=0;i<document.getElementsByName(obj).length;i++){
       document.getElementsByName(obj)[i].checked='checked';
	   
    }
}

function getRadioValue(obj){
	var returnTagValue;
 	for(var   i=0;i<document.getElementsByName(obj).length;i++)  {  
		if(document.getElementsByName(obj)[i].checked)
		{
		  returnTagValue=document.getElementsByName(obj)[i].value;   
		}
    }
	return returnTagValue;
}


function getElementById(name) {
	return document.getElementById(name);
}



function getElementByName(name) {
	var elements = document.getElementsByName(name);
	return elements[0];
}



function lTrim(str) {
	var rtnStr;
	rtnStr = "";
for (var i = 0; i < str.length; i++) {
	if (str.charAt(i) != " ") {
			rtnStr = str.substr(i);
			break;
		}
	}
	return rtnStr;
}



function rTrim(str) {
	var rtnStr;
	rtnStr = "";
for (var i = str.length - 1; i >= 0; i--) {
	if (str.charAt(i) != " ") {
			rtnStr = str.substring(0, i + 1);
			break;
		}
	}
	return rtnStr;
}



function trim(str) {
	return (lTrim(rTrim(str)));
}



function popMenu(menuDiv, width, rowControlString) {
    	
var pop = window.createPopup();

pop.document.body.innerHTML = menuDiv.innerHTML;
var rowObjs = pop.document.body.all[0].rows;
	
var rowCount = rowObjs.length;

for (var i = 0; i < rowObjs.length; i++) {
   
	var hide = rowControlString.charAt(i) != "1";
	if (hide) {
		rowCount--;
	}
  
	rowObjs[i].style.display = (hide) ? "none" : "";
   
	rowObjs[i].cells[0].onmouseover = function () {
		this.style.background = "#818181";
		this.style.color = "white";
	};
   
	rowObjs[i].cells[0].onmouseout = function () {
		this.style.background = "#cccccc";
		this.style.color = "black";
	};
}

pop.document.oncontextmenu = function () {
	return false;
};

pop.document.onclick = function () {
	pop.hide();
};

	pop.show(event.clientX - 1, event.clientY, width, rowCount * 30, document.body);
	return true;
}


function changeDisplay(objId){
		 var obj = document.getElementById(objId);
		 if(obj.style.display==''){
	 		obj.style.display='block';
	 }else{
	 		obj.style.display='';
		 }	
}

 function SetWinHeight(obj)    
{    
    var srchFrame = obj;    
    if (document.getElementById)    
    {    
        if (srchFrame && !window.opera)    
        {    
            if (srchFrame.contentDocument && srchFrame.contentDocument.body.offsetHeight)    
   
                srchFrame.height = srchFrame.contentDocument.body.offsetHeight;    
            else if (srchFrame.Document && srchFrame.Document.body.scrollHeight)    
                srchFrame.height = srchFrame.Document.body.scrollHeight;    
        }    
    }    
}


function useLoadingMessage(message) {
		var loadingMessage; 
		if (message) loadingMessage = message; 
		else loadingMessage = "Loading"; 
	DWREngine.setPreHook(
		function() { 
			var disabledZone = $('disabledZone'); 
			if (!disabledZone) { 
				disabledZone = document.createElement('div');
				disabledZone.setAttribute('id', 'disabledZone'); 
				disabledZone.style.position = "absolute"; 
				disabledZone.style.zIndex = "1000";
				disabledZone.style.left = "0px"; 
				disabledZone.style.top = "0px"; 
				disabledZone.style.width = "100%"; 
				disabledZone.style.height = "100%"; 
				document.body.appendChild(disabledZone);
				var messageZone = document.createElement('div');
				messageZone.setAttribute('id', 'messageZone'); 
				messageZone.style.position = "absolute"; 
				messageZone.style.top = "0px"; 
				messageZone.style.right = "0px"; 
				messageZone.style.background = "red"; 
				messageZone.style.color = "white"; 
				messageZone.style.fontFamily = "Arial,Helvetica,sans-serif"; 
				messageZone.style.padding = "4px"; 
				disabledZone.appendChild(messageZone); 
				var text = document.createTextNode(loadingMessage); 
				messageZone.appendChild(text); 
			} else { 
				$('messageZone').innerHTML = loadingMessage; 
				disabledZone.style.visibility = 'visible'; 
			}
		}
	);
	DWREngine.setPostHook(function() { $('disabledZone').style.visibility = 'hidden'; }); 
}	


function getDateString(d){
	var m = d.getMonth()+1;
	if(m<10){
		m = '0' + m;
	}
	var date = d.getDate();
	if(date<10){
		date = '0' + date;
	}
	return d.getYear() + '-' + m + '-' + date;
}

function setIframeHightByScreen(iframeId){
	var iframe = document.getElementById("srchFrame");
	var screenHigh = screen.availHeight;
	if(screenHigh>=(800-30))
		iframe.height=Math.round(screenHigh*0.499);
	else
		iframe.height=Math.round(screenHigh*0.476);
}

function getIframePicturewidth(){
	var w = screen.availWidth;
	if(w>=1280)
		return Math.round(w*0.81);
	else 
		return Math.round(w*0.77);
}

function getIframePictureHight(){
	var h = screen.availHeight;
	if(h>=(800-30))
		return Math.round(h*0.46);
	else
		return Math.round(h*0.43);
}

function print(){
	var print = this.document.getElementById("print").innerHTML;
	print = print +"<br/>";
	print = print +'<link href="../css/main.css" rel="stylesheet" type="text/css"><SCRIPT language=javascript> function printView(){hidden();document.all.WebBrowser.ExecWB(7,1);show(); } function print(){hidden();document.all.WebBrowser.ExecWB(6,1);show();}function pageSetup(){hidden();document.all.WebBrowser.ExecWB(8,1);show();}function hidden(){document.getElementById("buttonDiv").style.display="none"; }function show(){document.getElementById("buttonDiv").style.display="block";}<\/script>';
	print = print + "<OBJECT classid=CLSID:8856F961-340A-11D0-A96B-00C04FD705A2 height=21 id=WebBrowser width=87></OBJECT><div id='buttonDiv'><input id=printView name=Button onClick=printView() type=button value=打印预览>&nbsp;&nbsp;<input id =print name=Button onClick=print() type=button value=直接打印>&nbsp;&nbsp;<input id=pageSetup name=Button onClick=pageSetup() type=button value=页面设置></div>";
	var newWindow = window.open();
	newWindow.document.open("text/html");
	newWindow.document.write(print);
	newWindow.document.close();
}

function invalidEmail(item){
	var etext;
	var elen;
	var i;
	var aa;
	var uyear,umonth,uday;
	etext=item;
	elen=etext.length;
	if (elen<5)
 		return true;
	i= etext.indexOf("@",0);
	if (i==0 || i==-1 || i==elen-1)
 		return true;
	else
 		{if (etext.indexOf("@",i+1)!=-1)
  			return true;}
		if (etext.indexOf("..",i+1)!=-1)
 		return true;
	i=etext.indexOf(".",0)
	if (i==0 || i==-1 || etext.charAt(elen-1)=='.')
 		return true;
	if ( etext.charAt(0)=='-' ||  etext.charAt(elen-1)=='-')
 		return true;
	if ( etext.charAt(0)=='_' ||  etext.charAt(elen-1)=='_')
 		return true;
	for (i=0;i<=elen-1;i++)
		{ aa=etext.charAt(i)
 		 if (!((aa=='.') || (aa=='@') || (aa=='-') ||(aa=='_') || (aa>='0' && aa<='9') || (aa>='a' && aa<='z') || (aa>='A' && aa<='Z')))
   			return true;
		}
	return false;
}