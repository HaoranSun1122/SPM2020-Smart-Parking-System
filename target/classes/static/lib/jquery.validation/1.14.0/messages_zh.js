(function( factory ) {
	if ( typeof define === "function" && define.amd ) {
		define( ["jquery", "../jquery.validate"], factory );
	} else {
		factory( jQuery );
	}
}(function( $ ) {

/*
 * Translated default messages for the jQuery validation plugin.
 * Locale: ZH (Chinese, 中文 (Zhōngwén), 汉语, 漢語)
 */
$.extend($.validator.messages, {
	required: "This is a required field",
	remote: "Please correct this field",
	email: "Please enter a valid email address",
	url: "Please enter a valid URL",
	date: "Please enter a valid date",
	dateISO: "Please enter a valid date (YYYY-MM-DD)",
	number: "Please enter a valid number",
	digits: "Can only enter numbers",
	creditcard: "Please enter a valid credit card number",
	equalTo: "Your input is not the same",
	extension: "Please enter a valid suffix",
	maxlength: $.validator.format("You can enter up to {0} characters"),
	minlength: $.validator.format("Must enter at least {0} characters"),
	rangelength: $.validator.format("Please enter a string between {0} and {1}"),
	range: $.validator.format("Please enter a value between {0} and {1}"),
	max: $.validator.format("Please enter a value no greater than {0}"),
	min: $.validator.format("Please enter a value not less than {0}")
});

}));