Public Class Form1
    Private list As List(Of Package)
    Private packageObject As Package
    Private position As Integer
    Private randomObject As Random
    Private packageID As Integer

    Private Sub ShippingHubForm_Load(sender As System.Object,
      e As System.EventArgs) Handles MyBase.Load

        position = 0
        randomObject = New Random()
        packageID = randomObject.Next(1, 100000)


        stateComboBox.SelectedIndex = 0

        list = New List(Of Package)()
    End Sub


    Private Sub newButton_Click(sender As System.Object,
      e As System.EventArgs) Handles newButton.Click

        ClearControls()

        packageID += 1
        packageObject = New Package(packageID)

        packagenumberlabel.Text =
         packageObject.PackageNumber.ToString()
        arrivalTimeLabel.Text =
         packageObject.ArrivalTime.ToString()

        informationgroupbox.Enabled = True
        SetButtons(False)
        addButton.Enabled = True
        newButton.Enabled = False
        addressTextBox.Focus()
    End Sub


    Private Sub addButton_Click(sender As System.Object,
      e As System.EventArgs) Handles addButton.Click

        SetPackage()
        list.Add(packageObject)

        informationgroupbox.Enabled = False
        SetButtons(True)

        addButton.Enabled = False

        If stateComboBox.Text = viewpackagesComboBox.Text Then
            packagesListBox.Items.Add(packageObject.PackageNumber)
        End If

        viewpackagesComboBox.Text = packageObject.State
        newButton.Enabled = True
    End Sub


    Private Sub backButton_Click(sender As System.Object,
      e As System.EventArgs) Handles backButton.Click

        If position > 0 Then
            position -= 1
        Else
            position = list.Count - 1
        End If

        LoadPackage()
    End Sub


    Private Sub nextButton_Click(sender As System.Object,
      e As System.EventArgs) Handles nextButton.Click

        If position < list.Count - 1 Then
            position += 1
        Else
            position = 0
        End If

        LoadPackage()
    End Sub


    Private Sub removeButton_Click(sender As System.Object,
      e As System.EventArgs) Handles removeButton.Click

        If stateComboBox.Text = viewpackagesComboBox.Text Then
            packagesListBox.Items.Remove(packageObject.PackageNumber)
        End If

        list.RemoveAt(position)


        If list.Count > 0 Then

            If position > 0 Then
                position -= 1
            End If

            LoadPackage()
        Else
            ClearControls()
        End If

        SetButtons(True)
    End Sub


    Private Sub editUpdateButton_Click(sender As System.Object,
      e As System.EventArgs) Handles editUpdateButton.Click

        If editUpdateButton.Text = "&Edit" Then
            informationgroupbox.Enabled = True
            SetButtons(False)
            editUpdateButton.Enabled = True

            editUpdateButton.Text = "&Update"
        Else

            SetPackage()
            list.RemoveAt(position)
            list.Insert(position, packageObject)

            viewpackagesComboBox.Text = packageObject.State

            informationgroupbox.Enabled = False
            SetButtons(True)

            editUpdateButton.Text = "&Edit"
        End If
    End Sub

    Private Sub SetPackage()
        packageObject.Address = addressTextBox.Text
        packageObject.City = cityTextBox.Text
        packageObject.State =
        stateComboBox.SelectedItem.ToString()
        packageObject.Zip = ZipTextBox.Text
    End Sub


    Private Sub LoadPackage()

        packageObject = list(position)

        addressTextBox.Text = packageObject.Address
        cityTextBox.Text = packageObject.City
        stateComboBox.Text = packageObject.State
        ZipTextBox.Text = packageObject.Zip
        arrivalTimeLabel.Text =
         packageObject.ArrivalTime.ToString()
        packagenumberlabel.Text =
         packageObject.PackageNumber.ToString()
    End Sub


    Private Sub ClearControls()
        addressTextBox.Clear()
        cityTextBox.Clear()
        ZipTextBox.Clear()
        stateComboBox.SelectedText = String.Empty
        arrivalTimeLabel.Text = String.Empty
        packagenumberlabel.Text = String.Empty
    End Sub


    Private Sub SetButtons(state As Boolean)
        removeButton.Enabled = state
        editUpdateButton.Enabled = state
        nextButton.Enabled = state
        backButton.Enabled = state


        If list.Count < 2 Then
            nextButton.Enabled = False
            backButton.Enabled = False
        End If


        If list.Count = 0 Then
            editUpdateButton.Enabled = False
            removeButton.Enabled = False
        End If
    End Sub


    Private Sub viewPackagesComboBox_SelectedIndexChanged(
      sender As System.Object, e As System.EventArgs) _
      Handles viewpackagesComboBox.SelectedIndexChanged

        Dim state As String =
         viewpackagesComboBox.SelectedItem.ToString()

        packagesListBox.Items.Clear()


        Dim stateQuery = From p In list
                         Where p.State = state
                         Select p


        For Each viewPackage As Package In stateQuery

            packagesListBox.Items.Add(viewPackage.PackageNumber)
        Next
    End Sub
End Class