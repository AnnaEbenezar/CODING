Public Class Form1
    Dim html As String = "<HTML><BODY><TABLE>" &
          "<TR><TD>Antique Rocking Chair</TD>" &
          "<TD>&euro;82.67</TD></TR>" &
          "<TR><TD>Silver Teapot</TD>" &
          "<TD>&euro;64.55</TD></TR>" &
          "<TR><TD>Gold Pocket Watch</TD>" &
          "<TD>&euro;128.83</TD></TR>" &
          "</TABLE></BODY></HTML>"
    Private Sub SearchButton_Click(sender As Object, e As EventArgs) Handles SearchButton.Click
        Dim itemLocation As Integer
        Dim priceBegin As Integer
        Dim priceEnd As Integer
        Dim price As String
        Dim dollars As Decimal

        itemLocation = html.IndexOf(
         ItemsComboBox.SelectedItem.ToString())

        priceBegin = html.IndexOf("&euro;",
         itemLocation)
        priceEnd = html.IndexOf("</TD>", priceBegin)

        price = html.Substring(priceBegin,
         (priceEnd - priceBegin))

        price = price.Replace("&euro;", String.Empty)
        dollars = Convert.ToDecimal(Val(price) * 1.58)
        resultlabel.Text = String.Format("{0:C}", dollars)

    End Sub

    Private Sub ScreenScrapingForm_Load(sender As System.Object,
      e As System.EventArgs) Handles MyBase.Load
        htmlLabel.Text = html.Replace("&euro;", "&&euro;")
    End Sub

End Class
