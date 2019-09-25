package com.paychex.gitplease.hackathon.config;

public class TemplateConfig {
	
	private static String template = "<!doctype html>\r\n" + 
			"<html>\r\n" + 
			"  <head>\r\n" + 
			"    <meta name=\"viewport\" content=\"width=device-width\">\r\n" + 
			"    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n" + 
			"    <title>Simple Transactional Email</title>\r\n" + 
			"    <style>\r\n" + 
			"@media only screen and (max-width: 620px) {\r\n" + 
			"  table[class=body] h1 {\r\n" + 
			"    font-size: 28px !important;\r\n" + 
			"    margin-bottom: 10px !important;\r\n" + 
			"  }\r\n" + 
			"\r\n" + 
			"  table[class=body] p,\r\n" + 
			"table[class=body] ul,\r\n" + 
			"table[class=body] ol,\r\n" + 
			"table[class=body] td,\r\n" + 
			"table[class=body] span,\r\n" + 
			"table[class=body] a {\r\n" + 
			"    font-size: 16px !important;\r\n" + 
			"  }\r\n" + 
			"\r\n" + 
			"  table[class=body] .wrapper,\r\n" + 
			"table[class=body] .article {\r\n" + 
			"    padding: 10px !important;\r\n" + 
			"  }\r\n" + 
			"\r\n" + 
			"  table[class=body] .content {\r\n" + 
			"    padding: 0 !important;\r\n" + 
			"  }\r\n" + 
			"\r\n" + 
			"  table[class=body] .container {\r\n" + 
			"    padding: 0 !important;\r\n" + 
			"    width: 100% !important;\r\n" + 
			"  }\r\n" + 
			"\r\n" + 
			"  table[class=body] .main {\r\n" + 
			"    border-left-width: 0 !important;\r\n" + 
			"    border-radius: 0 !important;\r\n" + 
			"    border-right-width: 0 !important;\r\n" + 
			"  }\r\n" + 
			"\r\n" + 
			"  table[class=body] .btn table {\r\n" + 
			"    width: 100% !important;\r\n" + 
			"  }\r\n" + 
			"\r\n" + 
			"  table[class=body] .btn a {\r\n" + 
			"    width: 100% !important;\r\n" + 
			"  }\r\n" + 
			"\r\n" + 
			"  table[class=body] .img-responsive {\r\n" + 
			"    height: auto !important;\r\n" + 
			"    max-width: 100% !important;\r\n" + 
			"    width: auto !important;\r\n" + 
			"  }\r\n" + 
			"}\r\n" + 
			"@media all {\r\n" + 
			"  .ExternalClass {\r\n" + 
			"    width: 100%;\r\n" + 
			"  }\r\n" + 
			"\r\n" + 
			"  .ExternalClass,\r\n" + 
			".ExternalClass p,\r\n" + 
			".ExternalClass span,\r\n" + 
			".ExternalClass font,\r\n" + 
			".ExternalClass td,\r\n" + 
			".ExternalClass div {\r\n" + 
			"    line-height: 100%;\r\n" + 
			"  }\r\n" + 
			"\r\n" + 
			"  .apple-link a {\r\n" + 
			"    color: inherit !important;\r\n" + 
			"    font-family: inherit !important;\r\n" + 
			"    font-size: inherit !important;\r\n" + 
			"    font-weight: inherit !important;\r\n" + 
			"    line-height: inherit !important;\r\n" + 
			"    text-decoration: none !important;\r\n" + 
			"  }\r\n" + 
			"\r\n" + 
			"  #MessageViewBody a {\r\n" + 
			"    color: inherit;\r\n" + 
			"    text-decoration: none;\r\n" + 
			"    font-size: inherit;\r\n" + 
			"    font-family: inherit;\r\n" + 
			"    font-weight: inherit;\r\n" + 
			"    line-height: inherit;\r\n" + 
			"  }\r\n" + 
			"\r\n" + 
			"  .btn-primary table td:hover {\r\n" + 
			"    background-color: #34495e !important;\r\n" + 
			"  }\r\n" + 
			"\r\n" + 
			"  .btn-primary a:hover {\r\n" + 
			"    background-color: #34495e !important;\r\n" + 
			"    border-color: #34495e !important;\r\n" + 
			"  }\r\n" + 
			"}\r\n" + 
			"</style>\r\n" + 
			"  </head>\r\n" + 
			"  <body class=\"\" style=\"background-color: #f6f6f6; font-family: sans-serif; -webkit-font-smoothing: antialiased; font-size: 14px; line-height: 1.4; margin: 0; padding: 0; -ms-text-size-adjust: 100%; -webkit-text-size-adjust: 100%;\">\r\n" + 
			"    <span class=\"preheader\" style=\"color: transparent; display: none; height: 0; max-height: 0; max-width: 0; opacity: 0; overflow: hidden; mso-hide: all; visibility: hidden; width: 0;\">This is preheader text. Some clients will show this text as a preview.</span>\r\n" + 
			"    <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"body\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #f6f6f6; width: 100%;\" width=\"100%\" bgcolor=\"#f6f6f6\">\r\n" + 
			"      <tr>\r\n" + 
			"        <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top;\" valign=\"top\">&nbsp;</td>\r\n" + 
			"        <td class=\"container\" style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; display: block; max-width: 580px; padding: 10px; width: 580px; margin: 0 auto;\" width=\"580\" valign=\"top\">\r\n" + 
			"          <div class=\"content\" style=\"box-sizing: border-box; display: block; margin: 0 auto; max-width: 580px; padding: 10px;\">\r\n" + 
			"\r\n" + 
			"            <!-- START CENTERED WHITE CONTAINER -->\r\n" + 
			"            <table role=\"presentation\" class=\"main\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; background: #ffffff; border-radius: 3px; width: 100%;\" width=\"100%\">\r\n" + 
			"\r\n" + 
			"              <!-- START MAIN CONTENT AREA -->\r\n" + 
			"              <tr>\r\n" + 
			"                <td class=\"wrapper\" style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; box-sizing: border-box; padding: 20px;\" valign=\"top\">\r\n" + 
			"                  <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; width: 100%;\" width=\"100%\">\r\n" + 
			"                    <tr>\r\n" + 
			"                      <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top;\" valign=\"top\">\r\n" + 
			"                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; margin-bottom: 15px;\">Hi <NAME>,</p>\r\n" + 
			"                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; margin-bottom: 15px;\">This is to inform you the pricing for your requested <SERVICE> service is: <PRICE> $ </p>\r\n" + 
			"                        <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"btn btn-primary\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; box-sizing: border-box; width: 100%;\" width=\"100%\">\r\n" + 
			"                          <tbody>\r\n" + 
			"                            <tr>\r\n" + 
			"                              <td align=\"left\" style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; padding-bottom: 15px;\" valign=\"top\">\r\n" + 
			"                                <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; width: auto;\">\r\n" + 
			"                                  <tbody>\r\n" + 
			"                                    <tr>\r\n" + 
			"                                      <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top; border-radius: 5px; text-align: center; background-color: #3498db;\" valign=\"top\" align=\"center\" bgcolor=\"#3498db\"> <a href=\"http://localhost:8080\" target=\"_blank\" style=\"border: solid 1px #3498db; border-radius: 5px; box-sizing: border-box; cursor: pointer; display: inline-block; font-size: 14px; font-weight: bold; margin: 0; padding: 12px 25px; text-decoration: none; text-transform: capitalize; background-color: #3498db; border-color: #3498db; color: #ffffff;\">Explore More ?</a> </td>\r\n" + 
			"                                    </tr>\r\n" + 
			"                                  </tbody>\r\n" + 
			"                                </table>\r\n" + 
			"                              </td>\r\n" + 
			"                            </tr>\r\n" + 
			"                          </tbody>\r\n" + 
			"                        </table>\r\n" + 
			"                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; margin-bottom: 15px;\">Our representative will get in touch with your shortly.Please visit our website for more information.</p>\r\n" + 
			"                        <p style=\"font-family: sans-serif; font-size: 14px; font-weight: normal; margin: 0; margin-bottom: 15px;\">Thank you for contacting us.</p>\r\n" + 
			"                      </td>\r\n" + 
			"                    </tr>\r\n" + 
			"                  </table>\r\n" + 
			"                </td>\r\n" + 
			"              </tr>\r\n" + 
			"\r\n" + 
			"            <!-- END MAIN CONTENT AREA -->\r\n" + 
			"            </table>\r\n" + 
			"            <!-- END CENTERED WHITE CONTAINER -->\r\n" + 
			"\r\n" + 
			"            <!-- START FOOTER -->\r\n" + 
			"            <div class=\"footer\" style=\"clear: both; margin-top: 10px; text-align: center; width: 100%;\">\r\n" + 
			"              <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: separate; mso-table-lspace: 0pt; mso-table-rspace: 0pt; width: 100%;\" width=\"100%\">\r\n" + 
			"                <tr>\r\n" + 
			"                  <td class=\"content-block\" style=\"font-family: sans-serif; vertical-align: top; padding-bottom: 10px; padding-top: 10px; color: #999999; font-size: 12px; text-align: center;\" valign=\"top\" align=\"center\">\r\n" + 
			"                    <span class=\"apple-link\" style=\"color: #999999; font-size: 12px; text-align: center;\">Paychex,  No 90, GR Icon building, Jyoti Nivas College Road, Koramangala</span>\r\n" + 
			"                    <br> Don't like these emails? <a href=\"http://i.imgur.com/CScmqnj.gif\" style=\"text-decoration: underline; color: #999999; font-size: 12px; text-align: center;\">Unsubscribe</a>.\r\n" + 
			"                  </td>\r\n" + 
			"                </tr>\r\n" + 
			"                <tr>\r\n" +
			"                  </td>\r\n" + 
			"                </tr>\r\n" + 
			"              </table>\r\n" + 
			"            </div>\r\n" + 
			"            <!-- END FOOTER -->\r\n" + 
			"\r\n" + 
			"          </div>\r\n" + 
			"        </td>\r\n" + 
			"        <td style=\"font-family: sans-serif; font-size: 14px; vertical-align: top;\" valign=\"top\">&nbsp;</td>\r\n" + 
			"      </tr>\r\n" + 
			"    </table>\r\n" + 
			"  </body>\r\n" + 
			"</html>";

	public static String getTemplate() {
		return template;
	}

}
