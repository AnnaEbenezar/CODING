Public Class Form1
    Dim countries As String() = {"Russia", "China", "Australia",
      "United States", "Italy", "South Africa", "Brazil", "Spain"}


    Dim used As Boolean() =
      New Boolean(0 To countries.GetUpperBound(0)) {}

    Dim count As Integer = 1
    Dim country As String

    Private Sub FlagQuizForm_Load(sender As System.Object,
      e As System.EventArgs) Handles MyBase.Load

        Array.Sort(countries)

        countriesCombobox.DataSource = countries

        DisplayFlag()
    End Sub


    Function BuildPathName() As String
        Return String.Format("images\{0}.png",
         country.Replace(" ", String.Empty))
    End Function


    Function GetUniqueRandomNumber() As Integer
        Dim randomObject As New Random()
        Dim randomNumber As Integer

        Do
            randomNumber = randomObject.Next(0, used.Length)
        Loop Until used(randomNumber) = False


        used(randomNumber) = True

        Return randomNumber
    End Function

    Sub DisplayFlag()

        Dim randomNumber As Integer = GetUniqueRandomNumber()

        country = countries(randomNumber)

        Dim path As String = BuildPathName()
        flagpicture.Image = Image.FromFile(path)
    End Sub

    Private Sub submitButton_Click(sender As System.Object,
      e As System.EventArgs) Handles SubmitButton.Click

        Dim response As String = countriesCombobox.Text


        If response = country Then
            feedbacklabel.Text = "Correct!"
        Else
            feedbacklabel.Text = "Sorry, incorrect."
        End If


        If count >= 5 Then
            feedbacklabel.Text &= "  Done!"
            NextButton.Enabled = False
            countriesCombobox.Enabled = False
        Else
            NextButton.Enabled = True
        End If

        SubmitButton.Enabled = False
    End Sub


    Private Sub nextButton_Click(sender As System.Object,
      e As System.EventArgs) Handles NextButton.Click

        DisplayFlag()
        feedbacklabel.Text = String.Empty


        countriesCombobox.SelectedIndex = 0

        count += 1

        SubmitButton.Enabled = True
        NextButton.Enabled = False
    End Sub

End Class
