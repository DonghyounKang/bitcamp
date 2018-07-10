/**
 * 
 */
var trTemplateSrc=$('#tr-template').html();

//위에서 준비한 템플릿 데이터를 가지고 HTML을 생성할 템플릿 엔진 준비
var templateFn = Handlebars.compile(trTemplateSrc)

$.getJSON(serverRoot+"/json/board/list", (data) => {
	$(tableBody).html(templateFn({list:data}))
});

